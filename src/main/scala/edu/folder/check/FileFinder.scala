package edu.folder.check

import java.io.File

class FileFinder {

  def readLister(str: String): Unit= {
    val filesHere = (new File(str)).listFiles.toList
    for (file <- filesHere) {
      if (file.isDirectory()) {
        readLister(file.toString)
        }
      else {
        println(file)
      }
    }
  }
}


