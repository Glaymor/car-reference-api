package services

import com.google.inject.Inject
import repositories.CarRepository

import scala.concurrent.Future

class StatService@Inject()(val repository: CarRepository) {

  def getAllBrands: Future[Vector[String]] = {
    repository.getAllBrands
  }

  def getAllColors: Future[Vector[String]] = {
    repository.getAllColors
  }

  def countCar: Future[Vector[Int]] = {
    repository.countCar
  }
}
