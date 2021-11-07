package com.clearurdoubt.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, lit}
import org.apache.spark.sql.types.DateType

object SparkJsonReader extends App {

  val spark = SparkSession
  .builder
  .appName("SparkJsonReader")
  .master("local[*]")
  .getOrCreate()

  val df = spark.read.format("json").load("src/main/resources/customer.json")
  df.show()

  println(s"df count = ${df.count()})")
  val df1 = df.withColumn("Name",lit("haripriya chinthalapati"))
    .withColumn(colName = "birthdate",col("birthdate").cast(DateType))
  df1.select(col("Name"),col("birthdate")).show
  df1.printSchema()
}
