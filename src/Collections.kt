fun main() {
    // mutable and immutable arrays
    // immutable
    val galaxies = listOf("milky way", "andromeda", "spiral")
    println(galaxies.sorted())
    println(galaxies[1])

    // mutable
    val outerPlanets = arrayListOf("Jupiter", "Saturn", "Uranus")
    println(outerPlanets.size)
    println(outerPlanets[0])
    outerPlanets.add("Neptune")
    println(outerPlanets.indexOf("Neptune"))

    // maps (dictionaries)
    // immutable
    val planetType = mapOf(
        "Mercury" to  "Larva planet",
        "Venus" to "Rocky planet",
        "Jupiter" to "Gas giant",
        "HB033" to "Water planet"
    )
    println(planetType)
    println(planetType["Jupiter"])

    // mutable
    val starTypes = hashMapOf(
        "Sun" to "Red Dwarf",
        "HB99F" to "White Dwarf",
        "Rigel" to "Super Giant Star"
    )
    println(starTypes)
    starTypes["HO556"] = "Variable Star"
    println(starTypes)
}