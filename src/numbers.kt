fun main() {
    val a = 27
    val b = 9

    // + - / * % basic math

    fun activatePow(){
        println("Activating powers")
    }

    activatePow()

    fun usePower(line: String){
        println(line)
    }

    usePower("Induce will and mind power, make stuff float")

    fun powerTrajectory(people: Int, angle: Int): Int{
        return people * angle
    }

    val o = powerTrajectory(24, 180)
    println("Using $o Newtons of power")

    fun multiplyStuff(a : Int, b: Int): Int{
        return a * b
    }

    fun addStuff(a: Int, b: Int): Int{
        return a + b
    }

    fun getRemainder(a: Int, b: Int): Int{
        return a % b
    }

    fun divisibilityTest(a: Int, b: Int): Boolean{
        if (getRemainder(a, b) == 0){
            return true
        }
        return false
    }

    val u = multiplyStuff(a,b)
    println("Product: $u")

    val j = addStuff(a, b)
    println("Sum: $j")

    val h = getRemainder(5, 2)
    println("Rm: $h")

    val z = divisibilityTest(90, 3)
    println("Is divisible: $z")

    val powerLvl = 990

    if(powerLvl <= 200){
        println("Zero level power")
    } else if (powerLvl in 201..500){
        println("Mortal level power")
    } else if (powerLvl in 501..700){
        println("Angel level power")
    } else if (powerLvl in 701..800){
        println("Stellar level power")
    } else{
        println("God level power")
    }

    fun getPercentageFinish(i: Int): Int{
        return (i * 100) / 94
    }

    val s = getPercentageFinish(22)
    println("Currently at : $s %")

}