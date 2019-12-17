fun main(){
    val animalerie = Animalerie()

    animalerie.ajouterAnimal(Chat())
    animalerie.ajouterAnimal(Lion())
    animalerie.ajouterAnimal(Singe())

    for (animal in animalerie.list){
        animal.parler()
        animal.quiSuisJe()
    }


}