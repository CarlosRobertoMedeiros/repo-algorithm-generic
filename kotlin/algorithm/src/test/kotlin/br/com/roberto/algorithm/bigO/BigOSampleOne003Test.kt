package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BigOSampleOne003Test {

    private lateinit var bigOSampleOne003: BigOSampleOne003

    @BeforeEach
    fun setup(){
        bigOSampleOne003 = BigOSampleOne003()
    }

    @Test
    @DisplayName("should return the position where find the target value")
    fun `should print the target value`(){
        val numbers = intArrayOf(10,8,6,4,2,1,3,5,7,9)
        val target = 7
        val returnValue = bigOSampleOne003.binarySearchNumber(numbers, target)

        Assertions.assertEquals(6, returnValue)
    }

    @Test
    @DisplayName("should return -1 when not foud the target value")
    fun `should return -1 when not foud the target value`(){
        val numbers = intArrayOf(10,8,6,4,2,1,3,5,7,9)
        val target = 11
        val returnValue = bigOSampleOne003.binarySearchNumber(numbers, target)

        Assertions.assertEquals(-1, returnValue)
    }

    @Test
    @DisplayName("should return the position where find the target value")
    fun `should print the target value in String`(){
        val text = arrayOf(
            "Zebra", "Apple", "Monkey", "Sun", "Moon", "Ocean", "Laptop", "Bottle", "Clock", "Desk", "Elephant", "Giraffe",
            "Banana", "Orange", "Pineapple", "Strawberry", "Chocolate", "Rain", "Thunder", "Snow", "Fire", "Water", "Mountain",
            "River", "Forest", "Jungle", "Sky", "Cloud", "Rainbow", "Comet", "Galaxy", "Star", "Planet", "Asteroid", "Rocket",
            "Satellite", "Camera", "Picture", "Memory", "Dream", "Hope", "Future", "Past", "History", "Science", "Math", "Physics",
            "Chemistry", "Biology", "Energy", "Atom", "Molecule", "Cell", "Virus", "Bacteria", "Medicine", "Doctor", "Nurse",
            "Hospital", "Ambulance", "Police", "Firefighter", "Rescue", "Survivor", "Hero", "Villain", "Story", "Adventure",
            "Mystery", "Detective", "Crime", "Justice", "Law", "Judge", "Court", "Prison", "Escape", "Journey", "Travel", "Vacation",
            "Holiday", "Beach", "Resort", "Island", "Boat", "Ship", "Submarine", "Diver", "Fish", "Shark", "Whale", "Dolphin",
            "Seagull", "Eagle", "Falcon", "Owl", "Wolf", "Tiger", "Lion", "Panther", "Cheetah", "Leopard", "Bear", "Fox",
            "Squirrel", "Rabbit", "Deer", "Horse", "Donkey", "Cow", "Sheep", "Goat", "Pig", "Chicken", "Duck", "Goose", "Pigeon",
            "Parrot", "Penguin", "Kangaroo", "Koala", "Crocodile", "Alligator", "Turtle", "Snake", "Lizard", "Frog", "Insect",
            "Butterfly", "Bee", "Ant", "Spider", "Scorpion", "Dragonfly", "Caterpillar"
        )

        val target = "Dolphin"
        val (index, iterations) = bigOSampleOne003.binarySearchText(text, target)

        Assertions.assertEquals(35, index)
        Assertions.assertTrue(iterations in 1..8)
    }
}