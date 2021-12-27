fun main() {
    val person1 = Person("Nikola Tesla", 86)
    println(person1.details())
    println(person1.checkDNA())

    val saitama = SuperHero("Saitama", 25, "Extreme physical capability", "One Punch Man",999)
    saitama.age = 26
    println(saitama.details())
    println(saitama.getSuperHeroDetails())
    println(saitama.checkDNA())
}