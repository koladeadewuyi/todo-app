import org.joda.time.DateTime

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
}
