import kotlin.math.abs
import kotlin.random.Random

fun WelcomeMessage() {
    println("Hello! My name is DICT_Bot")

}

fun EvilNameStealer(): String {
    println("Please, remind me your name.")
    print("> ")
    val NameToSteal = readln()

    return NameToSteal
}

fun AgeGuesser() {
    println("Let me guess your age.")
    println("Enter reminders of your age by 3, 5 and 7")
    print("Reminder by 3: > ")
    val Rem3 = readln().toInt()
    print("Reminder by 5: > ")
    val Rem5 = readln().toInt()
    print("Reminder by 7: > ")
    val Rem7 = readln().toInt()
    val Age =  (Rem3 * 70 + Rem5 * 21 + Rem7 * 15) % 105
    println("Your age is: $Age!")
}

fun ProveCounter(){
    println("Now I will prove to you that I can count to any positive number you want")
    val NumberToProve = abs(readln().toInt())
    var i = 0
    while (i <= NumberToProve) {
        println("DICT_bot: $i!")
        i++
    }
}

fun LeTest(Question: String, Answer: String, WrongAnswer: String,WrongAnswer2: String,WrongAnswer3: String) {
    println(Question)

    val Answers = listOf(
        Answer to true,
        WrongAnswer to false,
        WrongAnswer2 to false,
        WrongAnswer3 to false
    ).shuffled()


    Answers.forEachIndexed { index, pair ->
        println("${index + 1}. ${pair.first}")
    }
    var test_run = true
    while (test_run) {
        print("Your answer: ")
        var UserAnswer = readln().toIntOrNull() ?: 0
        if (UserAnswer in 1..Answers.size) {
            val selectedAnswer = Answers[UserAnswer - 1]
            if (selectedAnswer.second) {
                println("Completed, have a nice day!\nCongratulations, have a nice day!")
                test_run = false
            } else {
                println("Please, try again")
            }

        }
    }


}




fun main() {
    WelcomeMessage()
    val Name = EvilNameStealer()
    println("What a great name you have: $Name")
    AgeGuesser()
    ProveCounter()
    var Question = "Why do we use methods?"
    var Answer = "To decompose a program into several small subroutines"
    var WrongAnswer = "To repeat a statement multiple times"
    var WrongAnswer2 = "To determine the execution time of a program"
    var WrongAnswer3 = "To interrupt the execution of a program"
    LeTest(Question, Answer, WrongAnswer, WrongAnswer2, WrongAnswer3)
}