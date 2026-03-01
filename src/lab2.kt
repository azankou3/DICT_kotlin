import kotlin.math.abs
import kotlin.math.ceil

fun oddEven(num: Int): Boolean {
//    println(num%2)
//    println("num:$num % 2 = ${num%2}")
    if (num%2 == 0){
        return true
    }else{
        return false
    }

}

fun Step1_3(number: Int = 2){
    var oper2: Int
    println("1. This number $number is Odd or Even : ${oddEven(number)}")
    if (oddEven(number)) {
        oper2 = number * 4
    } else {
        oper2 = number * 5
    }
    println("2. ${oper2}")
    var oper3: Int = abs(oper2)
    oper3 = oper3 * (-1)
    println("3. ${oper3}")
}

fun Century(year: Int): Int {
    var century: Float = year.toFloat()/100
    var century_Int: Int = ceil(century).toInt()
//    println(century_Int)
    return century_Int
}

fun MinNumber(numbs: Array<Int>) {

    var min: Int
    min = numbs[0]
    var i = 0
    while (i < numbs.size) {
        if (min > numbs[i]) {
            min = numbs[i]
        }else {
            i++
        }
    }
    println(min)
}


fun TwoMAX(numbs: List<Int>): List<Int> {
    var x: Int = numbs.size
    var i = 0
    var MaxNumber: Int = 0
    var SecondHighest: Int = 0
    while (i < x) {
        println("\n-----------------------------\n" +
                "Start\nIndex is $i\nnumbs[$i] = ${numbs[i]}" +
                "\n-----------------------------\n" +
                "MAX: ${numbs[MaxNumber]}\nSecond: ${numbs[SecondHighest]}" +
                "\n-----------------------------\n" +
                "End\n\n\n")
        if (numbs[i] > numbs[MaxNumber]) {
            SecondHighest = MaxNumber
            MaxNumber = i
        } else {
            if (numbs[i] > numbs[SecondHighest]) {
                SecondHighest = i
            }
        }

        i++
    }


    return listOf(numbs[MaxNumber], numbs[SecondHighest])
}

fun s7(Numbers: Array<Int>): Array<Int> {
        println("Numbers : ${Numbers.joinToString(",")}")
        var PosNumb: Array<Int> = arrayOf()
        var NegNumb: Array<Int> = arrayOf()
        for (i in Numbers) {
            if (i >= 0) {
                PosNumb += i
            } else if (i < 0) {
                NegNumb += i
            }
        }
        var NegSum = 0
        for (i in NegNumb) {
            NegSum += i
        }
//        println("${PosNumb.size}, \n$NegSum")
        return arrayOf(PosNumb.size, NegSum)

}

fun CountGOlosni(X: String): Int {
    val GOLOSNI = arrayOf('a','e','i','o','u')
    var CounterOFGolosni = 0
    for (i in X.indices) {
//        println(X[i])
        if (GOLOSNI.contains(X[i].lowercaseChar())) {
            CounterOFGolosni++
        }
    }

    println("Кількість голосних в:\n$X\nДорівнює: $CounterOFGolosni")
    return CounterOFGolosni
}

fun Median(X: String): String {
    println("Median : $X")
    val Lenght = X.length
//    println("Lenght : $Lenght\n Lenght/2 : ${X.length/2}\n Lenght%2 : ${X.length%2}")
    var tr = Lenght%2
    val L = (Lenght/2) - 1
    if (tr == 0) {
//        println("tr = 0 ${tr==0}")
        println("${X[L]} ${X[Lenght/2]}")
    } else {
        println("${X[Lenght/2]}")
    }
    return " "
}

fun Matrix(n: Int): List<List<Int>> {
    val table = mutableListOf<List<Int>>()
    for (i in 1..n) {
        val row = mutableListOf<Int>()
        for (j in 1..n) {
            row.add(i * j)
        }
        table.add(row)
    }
    return table
}

fun main() {
    Step1_3()
    Century(2001)
    var numbs = arrayOf(34, 15, 88, 2)
    MinNumber(numbs)
    var numbs_list: List<Int> = listOf(1, 5, 87, 45, 8, 8)
    var x = TwoMAX(numbs_list)
    println(x)

    var Numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
    println(s7(Numbers).joinToString())
    val LoremImpsum ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet venenatis est. Duis lacinia euismod sapien, id rutrum diam pellentesque in. Nulla non arcu id erat aliquam lobortis. Curabitur eget egestas ligula. Maecenas mollis pellentesque bibendum. Nullam quis nunc vel elit viverra egestas. Sed vel auctor ante. Praesent ornare lacinia massa sit amet tristique.\n" +
            "\n" +
            "Aliquam iaculis, velit nec fringilla consequat, quam enim elementum velit, ut interdum enim magna sit amet est. Phasellus tristique mollis erat non porttitor. Donec eu auctor diam. Suspendisse vel nisi nec magna pretium elementum. Nunc ornare volutpat lectus, dictum semper eros consequat eu. Vivamus faucibus mi a lacus euismod, vitae condimentum erat pellentesque. Vestibulum enim tortor, ullamcorper in sem in, maximus malesuada turpis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;\n" +
            "\n" +
            "Pellentesque euismod eget magna sed interdum. Vivamus eu quam est. Sed vulputate finibus semper. Nullam sit amet cursus justo, vel tristique purus. Phasellus quis arcu ut leo auctor lacinia at eu lectus. Nulla ut iaculis neque, at rutrum erat. Maecenas lobortis nisi in bibendum ullamcorper. Nam lobortis massa eu ex ullamcorper dapibus. Curabitur finibus tortor metus. Quisque ac luctus erat.\n" +
            "\n" +
            "Etiam eget turpis pretium, efficitur mi porttitor, interdum lectus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse luctus sapien ut turpis sollicitudin, id efficitur magna venenatis. Vestibulum in eros a massa fermentum maximus nec et lectus. Sed felis massa, consectetur sed elit eget, vestibulum accumsan nulla. Maecenas consectetur porttitor quam, quis iaculis quam ornare sit amet. Nunc eu gravida odio. Cras sed tellus vel sem imperdiet vehicula a egestas odio. Morbi faucibus accumsan libero vitae ornare. In tempor diam nec purus maximus dapibus. Cras in fringilla sem. Aenean elit magna, fringilla sed laoreet eget, facilisis eu elit.\n" +
            "\n" +
            "Nam sed consectetur urna. Aenean fringilla ligula et efficitur gravida. Quisque eget mauris sit amet massa iaculis posuere. Phasellus eu hendrerit ante, non dictum ex. Fusce nec consequat nulla, sit amet maximus felis. Vivamus feugiat mauris in lectus fermentum, et hendrerit metus volutpat. Quisque ultrices elementum nunc in faucibus. Cras ultrices mi sit amet elit eleifend malesuada. Vivamus lobortis vestibulum felis, non sollicitudin justo laoreet ut. Nulla felis nunc, accumsan ut venenatis eget, consequat sit amet orci. Maecenas condimentum pharetra aliquet. Nam viverra nulla mauris, a suscipit eros commodo vel. Nullam ut mauris nibh. Integer molestie fermentum purus, non dapibus lorem rhoncus in. Nulla laoreet magna eu urna fermentum efficitur."
    CountGOlosni(LoremImpsum)

    val medi = "test"
    val medi2 = "student"
    val medi3 = "A"
    Median(medi)
    Median(medi2)
    Median(medi3)

    val N = 3
    println(Matrix(N))

}