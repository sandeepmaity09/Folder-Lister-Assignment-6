package edu.folder.check

/**
  * Created by ghost on 3/2/17.
  */
object MainTester extends App {

  val path = GetPath.path
  val reader = new FileFinder

  reader.readLister(path)

}
