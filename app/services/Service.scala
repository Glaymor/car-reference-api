package services

import scala.concurrent.Future

trait Service[T] {
  def getAll: Future[Seq[T]]
  def get(carNumber: String): Future[Seq[T]]
  def add(obj: T): Future[Int]
  def delete(carNumber: String): Future[Int]
}
