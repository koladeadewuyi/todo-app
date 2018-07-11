import org.joda.time.DateTime
import play.api.db._
import play.api.Play.current

package object model {

  object Occurrence extends Enumeration {
    type Occurrence = Value
    val Daily, Weekly, Monthly, Once = Value
  }

  object Alarm extends Enumeration {
    type Alarm = Value
    val Beep, Email, None = Value
  }

  case class Task(id: String,
                  title: String,
                  description: Option[String],
                  createdOn: DateTime,
                  dueOn: DateTime,
                  occurrence: Occurrence.Value = Occurrence.Once,
                  alarm: Alarm.Value = Alarm.None)

  object Task {
    def all(): List[Task] = DB.withConnection { implicit c =>
      SQL("select * from task").as(task *)
    }

    def create(label: String) {}

    def delete(id: Long) {}
  }
}
