package controllers

import record.Record
import Food.Food

case class RecordController private() {

    def addFoodToRecord(record: Record, food: Food) : Boolean = {
        var res = false
        record.food(food) = food.caloriesPer100gr
        res = true
        res
    }
  
}