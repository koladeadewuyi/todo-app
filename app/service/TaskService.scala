package service

import javax.inject.Singleton
import model.Task

@Singleton
class TaskService {

  def all(): List[Task] = Nil

  def create(id: String): Unit = {}

  def delete(id: String): Unit = {}

}
