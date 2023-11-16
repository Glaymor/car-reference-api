package connection

import slick.jdbc.PostgresProfile.api._

object PostgresConnection {
  private val url = "jdbc:postgresql://localhost:5432/test_db"
  private val user = "postgres"
  private val password = "********"
  private val driver = "org.postgresql.Driver"

  val db = Database.forURL(url, user, password, driver = driver)
}
