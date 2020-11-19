package Exercise

class Exercise(var description: String, var caloriesPerHour: Int) {
     
    def display()
    {
        println("Description : " + description);
        println("Calories : " + caloriesPerHour);
    }

}
