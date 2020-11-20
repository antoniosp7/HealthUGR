package controllers

import record.Record
import Food.Food

case class RecordController private() {

    def addFoodToRecord(record: Record, food: Food, grams: Int) : Boolean = {
        var res = false
        record.food(food) = food.caloriesPer100gr
        var caloriesConsumed = (food.caloriesPer100gr * grams) / 100
        record.caloriesConsumed += caloriesConsumed
        res = true
        res
    }

    
  
}