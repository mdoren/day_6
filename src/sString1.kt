fun main(){
    var s1 = "Thing"
    var s2 = "THING"

    if (s1.compareTo(s2, true) == 0)
        println("Same")
    else
        println("Not same")

    println(s2.toLowerCase().capitalize())

    println("The length is ${s2.length}")
    println("The first character is ${s2[0]}")

    var result1 = s1.indexOf('h')
    println(result1)

    println(s1.substring(result1, 3))

    println(s1.contains("hi", true))

    println(s1.replace("thing", "other thing", true))

}