import kotlin.random.Random

fun main() {

    val names = mutableListOf(
        "Sakibul Hasan",
        "Farhan Rafi",
        "Al Rafi Chowdhury",
        "Shatabdi Chatterjee",
        "Sajnin sampa",
        "Tahmida Sultana Tithi",
        "Faria Tabassum",
        "Jaanati Akter Jui",
        "Utsho Ahmed",
        "Maksudur Rahman",
        "Dil Najmin Dipti",
        "Shamima Haque",
        "Amdadul Haque",
        "Abdul Kader",
        "Hosne Ara",
        "Shoriful",
        "Mahady Hasan",
        "Shafe Alam",
        "Ashik Mahmud",
        "Tariful Islam Shakil",
        "Md. Yeasin",
        "Hasibul Islam",
        "unknown1",
        "unknown2"
    )

    val remainingNames = names.toMutableList()

    println("Random name picker!")
    println("You can pick as many names as you want at once.\n")

    while (remainingNames.isNotEmpty()) {
        println("Enter number of names to pick (1 to ${remainingNames.size}):")
        val input = readLine()?.toIntOrNull()

        if (input != null && input in 1..remainingNames.size) {
            // Pick 'input' number of random names
            repeat(input) {
                val index = Random.nextInt(remainingNames.size)
                val selectedName = remainingNames[index]
                println("Selected: $selectedName")
                remainingNames.removeAt(index)
            }
        } else {
            println("Invalid number, try again.")
        }

        println("Remaining names: ${remainingNames.size}\n")
    }

    println("All names have been picked!")
}
