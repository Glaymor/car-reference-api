package services

import com.google.inject.Inject
import models.Car
import repositories.CarRepository

import scala.concurrent.Future

class CarService@Inject()(val repository: CarRepository) extends Service[Car] {
  override def getAll: Future[Seq[Car]] = repository.getAll

  override def get(carNumber: String): Future[Seq[Car]] = repository.get(carNumber)

  override def add(car: Car): Future[Int] = {
    val newCar = car.copy(
      number = car.number.toUpperCase,
      brand = car.brand.toLowerCase,
      color = car.color.toLowerCase
    )
    repository.add(newCar)
  }

  override def delete(carNumber: String): Future[Int] = repository.delete(carNumber)

  def getAllByColor(color: String): Future[Seq[Car]] = repository.getAllByColor(color)

  def getAllByBrand(brand: String): Future[Seq[Car]] = repository.getAllByBrand(brand)
}
