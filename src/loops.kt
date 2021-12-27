fun main() {
    println("Stars")
    val starTypes = hashMapOf(
        "Sun" to "Red Dwarf",
        "HB99F" to "White Dwarf",
        "Rigel" to "Super Giant Star"
    )
    for ((key, value) in starTypes){
        println("Star: $key Type: $value")
    }

    val outerPlanets = arrayListOf("Jupiter", "Saturn", "Uranus")
    println("\nOuter Planets:")
    for (planet in outerPlanets){
        println("Name: $planet")
    }

    var x = 90
    while (x > 0){
        println(x)
        x -= 9
    }

}