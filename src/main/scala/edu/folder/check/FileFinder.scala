package edu.folder.check

import java.io.File

import scala.collection.mutable.ListBuffer

class FileFinder {

  def readLister(str: String): ListBuffer[String]= {
    val filesHere = (new File(str)).listFiles.toList
    val result = ListBuffer[String]()
    for (file <- filesHere) {
      if (file.isDirectory()) {
        readLister(file.toString)
      }
      else {
        result+=file.toString
      }
    }
    result
  }


}


