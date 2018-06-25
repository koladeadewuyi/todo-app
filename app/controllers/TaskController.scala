package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class TaskController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def tasks() = TODO

  def newTask() = TODO

  def deleteTask(id: String) = TODO

}
