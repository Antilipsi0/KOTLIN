fun main(args: Array<String>) {

    //var
    val prixJuste: Int
    var prixTest: Int
    var prixFind: Boolean = false
    var checkQ: String
    var essai = 0


    println("Plus ou Moins\n")

    println("J1 \n")
    print("Entrez un nombre: ")
    prixJuste = readLine()!!.toInt()
    println("Votre nombre est le : $prixJuste" )

    println("\n \n \n \n \n \n \n") // Pour cacher le nombrer du J1 à la vue du J2

    do {
        println()
        essai++
        println("J2")
        println("Essai n°$essai :")
        print("Saisir un nombre ou quitter 'q' : ")

        checkQ = readLine()!!

        if (checkQ == "q") {
            println("Vous avez abandonné à l'essai n° $essai: le nombre était $prixJuste")
            prixFind = true
        } else {
            prixTest = checkQ.toInt()
            print("Votre nombre $prixTest est ")

            when {
                prixTest < prixJuste -> println("inférieur au nombre du J1 ... ")
                prixTest > prixJuste -> println("supérieur au nombre du J1 ... ")

                else -> {
                    println("égal au nombre du J1 !")
                    prixFind = true
                }
            }
            if (!prixFind) {
                when(prixTest){
                    in prixJuste-5..prixJuste+5 -> println("Bouillant")
                    in prixJuste-10..prixJuste+10 -> println("Très chaud")
                    in prixJuste-15..prixJuste+15 -> println("Chaud")
                    in prixJuste-20..prixJuste+20 -> println("Froid")
                    in prixJuste-30..prixJuste+30 -> println("Très froid")
                    in prixJuste-50..prixJuste+50 -> println("Glacé")
                }
            }
        }
    }while(!prixFind)
}