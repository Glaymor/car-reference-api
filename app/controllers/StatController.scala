package controllers

import play.api.libs.json.Json
import play.api.mvc._
import services.StatService

import javax.inject._
import scala.concurrent.ExecutionContext

@Singleton
class StatController @Inject()(val service: StatService,
                                val controllerComponents: ControllerComponents)
                              (implicit val ec: ExecutionContext) extends BaseController {

  def info: Action[AnyContent] = Action {
    Ok(views.html.info())
  }

  def getAllBrands: Action[AnyContent] = Action.async {
    service.getAllBrands.map {
      case brands =>
        if (brands.nonEmpty) Ok(Json.toJson(brands))
        else NotFound
      case _ => BadRequest
    }
  }

  def getAllColors: Action[AnyContent] = Action.async {
    service.getAllColors.map {
      case colors =>
        if (colors.nonEmpty) Ok(Json.toJson(colors))
        else NotFound
      case _ => BadRequest
    }
  }

  def countCar: Action[AnyContent] = Action.async {
    service.countCar.map { r =>
      Ok(Json.toJson(r))
    }
  }

}
