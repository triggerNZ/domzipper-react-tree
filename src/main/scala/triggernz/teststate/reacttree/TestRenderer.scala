package triggernz.teststate.reacttree

import scala.scalajs.js.annotation.JSImport
import scalajs.js

@js.native
trait TestRenderer extends js.Object {
  def toJSON(): js.Any = js.native
  def toTree(): js.Any = js.native
  def update(element: js.Any): Unit = js.native
  def unmount(): Unit = js.native
  def getInstance(): TestInstance = js.native
}

@js.native
trait TestInstance extends js.Object

@js.native
trait TestRendererOptions extends js.Object

@JSImport("react-test-renderer", JSImport.Default)
@js.native
object TestRenderer extends js.Object {
  def create(element: js.Any, opts: TestRendererOptions): TestRenderer = js.native

}
