fun main() {
    var board: Array<CharArray>
    board = Array(3) { CharArray(3) { ' ' } }

    fun printBoard() {
        println(" 0 1 2")
        for (i in 0..2) {
           print("$i")
           for (j in 0..2) {
               print(board[i][j])
                if (j < 2) print("|")
            }
            println()
            if (i < 2) println(" -----")
        }

    }
    println("doska dlya krestiki noliki")
    printBoard()
    var moves = 0
    while (moves < 9) {
        var player = if (moves % 2 == 0) 'X' else 'O'
        print("Your turn(0-2) $player:")
        val row = readLine()!!.toInt()
        print("Your second turn(0-2) $player:")
        val col = readLine()!!.toInt()
        if (row in 0..2 && col in 0..2 && board[row][col] == ' ') {
            board[row][col] = player
            moves++
            printBoard()
        } else
            print("Неправильный ход попробуйте снова ")
    }
}


