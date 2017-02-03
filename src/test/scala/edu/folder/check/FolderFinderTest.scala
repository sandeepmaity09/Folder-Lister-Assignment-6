package edu.folder.check

import org.scalatest.FunSuite
import scala.collection.mutable.ListBuffer

class FolderFinderTest extends FunSuite {

  val testFolder = new FileFinder

  test("Folder Empty"){
    assert(testFolder.readLister("/home")==ListBuffer())
  }
}
