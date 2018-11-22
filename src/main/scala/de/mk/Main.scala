package de.mk.sjsr

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.document

object Main {

	val component = 
		ScalaComponent.builder[Unit]("Main").renderStatic(<.div("Hallo Welt")).build

	def main(args: Array[String]): Unit = component().renderIntoDOM(document.getElementById("app"))
}
