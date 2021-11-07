package com.clearurdoubt.scala

object StudentDemo extends App {
  val hari = new Student("Hari","Badvity", 31)
  val gowthu = new Student("Gowthu", "Badity", 31)
  val caseHari = CaseStudent("Hari", "Chinthalapati", 31)
  val caseGowthu = caseHari.copy(firstName = "Gowthu")
  println(hari)
  println(gowthu)
  println(caseHari)
  println(caseGowthu)
}
