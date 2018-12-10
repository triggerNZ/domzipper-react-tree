package triggernz.teststate.reacttree

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import triggernz.teststate.reacttree.DemoComponent._

import scala.scalajs.js.JSON
import scalajs.js
object DemoMain {
  def main(args: Array[String]): Unit = {
    println("Running demo...")
    val component = HelloMessage("John")
    println(
      JSON.stringify(
    TestRenderer.create(component.raw, new js.Object().asInstanceOf[TestRendererOptions]).toJSON()))
  }
}


object DemoComponent {
  val HelloMessage = ScalaComponent.builder[String]("HelloMessage")
    .render($ => <.div("Hello ", $.props))
    .build
}