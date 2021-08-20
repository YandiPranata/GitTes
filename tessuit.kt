fun main() {
    println(
        """terminal:~terminal$
        |==========================
        |GAME SUIT TERMINAL VERSION
        |==========================
    """.trimMargin()
    )
    print("Masukkan Pemain 1 : ")
    val Pemain1: String = readLine()!!
    print("Masukkan Pemain 2 : ")
    val Pemain2: String = readLine()!!

    var status = false

    if (Pemain1!!.toLowerCase().equals(Pemain2.toLowerCase())) {
        println("""
            Hasil:
            DRAW !""".trimIndent())
    } else if (Pemain1.toLowerCase().equals("batu")) {
        if (Pemain2.toLowerCase().equals("gunting")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    } else if (Pemain1.toLowerCase().equals("gunting")) {
        if (Pemain2.toLowerCase().equals("kertas")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    } else if (Pemain1.toLowerCase().equals("kertas")) {
        if (Pemain2.toLowerCase().equals("batu")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    } else if (Pemain1.toLowerCase().equals("gunting")) {
        if (Pemain2.toLowerCase().equals("batu")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    } else if (Pemain1.toLowerCase().equals("kertas")) {
        if (Pemain2.toLowerCase().equals("gunting")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    } else if (Pemain1.toLowerCase().equals("batu")) {
        if (Pemain2.toLowerCase().equals("kertas")) {
            status = true
            hasil(status)
        } else {
            status = false
            hasil(status)
        }
    }
}
 fun hasil (status: Boolean) {
        if (status) {
            println("""
                
                Hasil:
                Pemain 1 Menang!!""".trimIndent())
        } else {
            println("""
                
                Hasil:
                Pemain 2 Menang!!""".trimIndent())
        }
}