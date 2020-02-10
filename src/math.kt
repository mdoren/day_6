import java.text.DecimalFormat

fun main(){
    val tax = .07
    val cost = 100

    //val twoDigits = DecimalFormat("0000.00")
    val twoDigits = DecimalFormat("$#,###.00")

    var totalcost = (tax * cost) + cost
    totalcost = 7.5
    var ourFormattedCost = twoDigits.format(totalcost)
    println("Result: $ourFormattedCost")
}