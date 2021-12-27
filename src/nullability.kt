fun main() {
    // nullable can be
    // made null without exception

    // nullable var
    var name: String?

    // normal non-nullable variable
    var planet: String = "Earth"
    println(planet)

    // must initialize var b4 using it
    name= "flex"
    println(name)

    // null check
    var len = 0

    // make name null
    name = null

    if (name != null){
        len = name.length
    } else{
        len = -1
    }
    println("Word length: $len")

    // null check 2
    val l = if (name != null) name.length else -1
    println("Word length: $l")


    // null check 3 with Safe Call
    println(name?.length)

    // null check 4 with Elvis Operator
    val el = name?.length ?: -1
    println(el)

    // create null exception (crash program) if null
//    println(name!!.length)

}