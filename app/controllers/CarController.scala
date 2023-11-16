package controllers

import models.Car
import play.api.libs.json.Json
import play.api.mvc._
import services.CarService

import javax.inject._
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CarController @Inject()(val carService: CarService,
                              val controllerComponents: ControllerComponents)
                             (implicit val ec: ExecutionContext) extends BaseController {

  def getAll: Action[AnyContent] = Action.async {
    carService.getAll.map {
      case cars =>
        if (cars.isEmpty) NotFound
        else Ok(Json.toJson(cars))
      case _ => BadRequest
    }
  }

  def getAllByColor(color: String): Action[AnyContent] = Action.async {
    carService.getAllByColor(color).map {
      case cars =>
        if (cars.isEmpty) NotFound
        else Ok(Json.toJson(cars))
      case _ => BadRequest
    }
  }

  def getAllByBrand(brand: String): Action[AnyContent] = Action.async {
    carService.getAllByBrand(brand).map {
      case cars =>
        if (cars.isEmpty) NotFound
        else Ok(Json.toJson(cars))
      case _ => BadRequest
    }
  }

  def get(number: String): Action[AnyContent] = Action.async {
    carService.get(number).map {
      case cars =>
        if (cars.isEmpty) NotFound
        else Ok(Json.toJson(cars))
      case _ => BadRequest
      }
    }


  def delete(number: String): Action[AnyContent] = Action.async {
    carService.delete(number).map {
      case 1 => Ok(Json.toJson("Successfully"))
      case _ => NotFound
    }
  }

  def add: Action[AnyContent] = Action.async { implicit request =>
    val jsonObj = request.body.asJson
    val newCar: Option[Car] = jsonObj.flatMap(Json.fromJson[Car](_).asOpt)
    newCar match {
      case Some(car) => carService.add(car).map {
        case 1 => Ok(Json.toJson("Successfully"))
        case _ => BadRequest
      }
      case None => Future{BadRequest}
    }
  }
}
