package repositories

import com.google.inject.Inject
import connection.PostgresConnection
import models.Car

import scala.concurrent.{ExecutionContext, Future}

class CarRepository@Inject()()(implicit val ec: ExecutionContext) extends Repository[Car] {

  import slick.jdbc.PostgresProfile.api._

  private class CarTable(tag: Tag) extends Table[Car](tag, "cars") {

    def number = column[String]("car_number_id", O.PrimaryKey)

    def brand = column[String]("car_brand")

    def color = column[String]("car_color")

    def year = column[String]("car_year")

    override def * =
      (number, brand, color, year) <> ((Car.apply _).tupled, Car.unapply)
  }

  private lazy val carTable = TableQuery[CarTable]


  override def getAll: Future[Seq[Car]] =
    PostgresConnection.db.run(carTable.result)

  override def get(carNumber: String): Future[Seq[Car]] =
    PostgresConnection.db.run(carTable.filter(_.number === carNumber).result)

  override def add(car: Car): Future[Int] = {
    PostgresConnection.db.run(carTable.insertOrUpdate(car))
  }

  override def delete(carNumber: String): Future[Int] =
    PostgresConnection.db.run(carTable.filter(_.number === carNumber).delete)

  def getAllByColor(color: String): Future[Seq[Car]] = {
    PostgresConnection.db.run(carTable.filter(_.color === color).result)
  }

  def getAllByBrand(brand: String): Future[Seq[Car]] = {
    PostgresConnection.db.run(carTable.filter(_.brand === brand).result)
  }

  def getAllColors: Future[Vector[String]] = {
    val query = sql"""SELECT DISTINCT car_color from cars""".as[String]
    PostgresConnection.db.run(query)
  }

  def getAllBrands: Future[Vector[String]] = {
    val query = sql"""SELECT DISTINCT car_brand from cars""".as[String]
    PostgresConnection.db.run(query)
  }

  def countCar: Future[Vector[Int]] = {
    val query = sql"""SELECT COUNT(*) from cars""".as[Int]
    PostgresConnection.db.run(query)
  }
}
