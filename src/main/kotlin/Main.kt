fun main() {
    val board: Array<CharArray>
    board = Array(3) {
        CharArray(3)  // <- ВАЖНО: создаем массив из 3 символов!
    }

    for (i in 0..2) {
        for (j in 0..2) {
            board[i][j] = ' ' // теперь это работает
        }
    }

    println("DOSKA dlya tiktactoe")

    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(" "+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println(" " +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(" "+board[2][2])

    print("Сначала выбери координату X(выбери 0-2):")
    val verh3 = readLine()!!.toInt()
    print("Теперь выбери координату BOKOVIYU:")
    val bok3 = readLine()!!.toInt()

    board[verh3][bok3] = 'x'
    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Теперь ходит O:")
    val verh4 = readLine()!!.toInt()
    print("Выбери боковую координату:")
    var bok4 = readLine()!!.toInt()
    board[verh4][bok4] = 'o'


    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Сначала выбери координату X(выбери 0-2):")
    val verh = readLine()!!.toInt()
    print("Теперь выбери координату BOKOVUYU:")
    var bok = readLine()!!.toInt()

    board[verh][bok] = 'x'
    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Теперь ходит O:")
    val verh2 = readLine()!!.toInt()
    print("Выбери боковую координату:")
    var bok2 = readLine()!!.toInt()
    board[verh2][bok2] = 'o'


    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Сначала выбери координату X(выбери 0-2):")
    val verh5 = readLine()!!.toInt()
    print("Теперь выбери координату BOKOVUYU:")
    var bok5 = readLine()!!.toInt()

    board[verh5][bok5] = 'x'
    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Теперь ходит O:")
    val verh6 = readLine()!!.toInt()
    print("Выбери боковую координату:")
    var bok6 = readLine()!!.toInt()
    board[verh6][bok6] = 'o'


    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Сначала выбери координату X(выбери 0-2):")
    val verh7 = readLine()!!.toInt()
    print("Теперь выбери координату BOKOVUYU:")
    var bok7 = readLine()!!.toInt()

    board[verh7][bok7] = 'x'
    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Теперь ходит O:")
    val verh8 = readLine()!!.toInt()
    print("Выбери боковую координату:")
    var bok8 = readLine()!!.toInt()
    board[verh8][bok8] = 'o'


    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])

    print("Сначала выбери координату X(выбери 0-2):")
    val verh9 = readLine()!!.toInt()
    print("Теперь выбери координату BOKOVUYU:")
    var bok9 = readLine()!!.toInt()

    board[verh9][bok9] = 'x'
    println(" 0 1 2")
    print("0"+board[0][0])
    print("|")
    print(board[0][1])
    print("|")
    println(""+board[0][2])

    println(" "+"-----")

    print("1"+board[1][0])
    print("|")
    print(board[1][1])
    print("|")
    println("" +board[1][2])

    println(" "+"-----")

    print("2"+board[2][0])
    print("|")
    print(board[2][1])
    print("|")
    println(""+board[2][2])
}

