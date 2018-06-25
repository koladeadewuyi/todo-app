import model.Alarm.Alarm
import model.Occurrence._
import org.joda.time.DateTime

package object model {

  object Occurrence extends Enumeration {
    type Occurrence
    val Daily, Weekly, Monthly, Once = Value
  }

  object Alarm extends Enumeration {
    type Alarm
    val Beep, Email, None = Value
  }

  case class Task(id: String,
                  title: String,
                  description: Option[String],
                  createdOn: DateTime,
                  dueOn: DateTime,
                  occurrence: Occurrence = Once,
                  alarm: Alarm = Alarm.None)
}
