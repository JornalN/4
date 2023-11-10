import java.util.Random

fun main(args: Array<String>) {
    var taskQuestion = true
    while (taskQuestion) {
        println("------------------------------------")
        println("Введите номер задачи (0 для завершения)")
        print("> ")
        var taskNumber: String = readln()
        println("------------------------------------")
        when (taskNumber.trim()) {
            "0" -> break
            "1" -> task1()
            "2" -> task2()
            "3" -> task3()
            "4" -> task4()
            "5" -> task5()
            "6" -> task6()
            else -> println("Неверный номер задачи")
        }
    }
}

val r = Random()

fun task1() {
    var exam = listOf(((1..10).random()),((1..10).random()),((1..10).random()))
    for (m in exam){
        if (m <= 5) println("" + exam.indexOf(m) + " экзамен сдан плохо. ($m)")
        else println("" + exam.indexOf(m) + " экзамен сдан хорошо. ($m)")
    }
}

fun task2() {
    var score = 0
    for(i in (1..3)){
        var shoot = r.nextBoolean()
        if(shoot) {
            score++
            println("Спортсмен попал по $i мишени.")
        } else {
            println("Спортсмен не попал по $i мишени.")
        }
    }
    println("Общее кол-во баллов: $score")
}

fun task3() {
    var xyz = 10000000
    var r = 14
    var s = 8
    for (i in (1..10)){
        println("$r  $s")
        for (j in (1..xyz/1000)){
            xyz += r
            xyz -= s
        }
        if (r > 7) r -= 1
        if (s > 6) s -= 1
    }
    println("Население в стране XYZ через 10 лет: $xyz")
}

fun task4() {
    println("Введите сумму вклада:")
    var deposit = readln().trim().toDouble()
    println("Введите срок вклада (мес.):")
    var months = readln().trim().toInt()
    for (i in (1..months)){
        deposit += deposit * 0.07
    }
    println("Сумма вклада по истечению $months мес.: $deposit")
}

fun task5() {
    println("Введите сумму вклада:")
    var deposit = readln().trim().toDouble()
    println("Введите срок вклада (мес.):")
    var months = readln().trim().toInt()
    var i = 0
    while(i < months){
        deposit += deposit * 0.07
        i++
    }
    println("Сумма вклада по истечению $months мес.: $deposit")
}

fun task6() {
    for (i in (1..9)){
        for (j in (1..9)){
            print("${i*j} \t")
        }
        println()
    }
}