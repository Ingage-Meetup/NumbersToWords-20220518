class Kata {
    private val ones = arrayOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    )

    private val teens = arrayOf(
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    )

    private val tens = arrayOf(
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    )

    fun numberToWords(number: Int): String {
        require(number < 1000000000) { "Number must be less than 1 billion (1000000000)" }
        return buildWords(number, StringBuilder())
    }

    private fun buildWords(number: Int, words: StringBuilder): String =
        if (number < 10) {
            if (words.isEmpty() || number > 0) {
                if (words.isNotEmpty() && words.last() != '-') {
                    words.append(" ")
                }
                words.append(ones[number]).toString().trim()
            } else {
                words.toString().trim()
            }
        } else if (number < 20) {
            words.append(" ").append(teens[number - 10])
            words.toString().trim()
        } else if (number < 100) {
            if (number % 10 == 0) {
                words.append(" ").append(tens[(number - 20) / 10])
                words.toString().trim()
            } else {
                val remainder = number % 10
                words.append(" ").append(tens[number.div(10) - 2]).append("-")
                buildWords(remainder, words)
            }
        } else if (number < 1000){
            val hundreds = number.div(100)
            val remainder = number % 100
            words.append(" ").append(ones[hundreds]).append(" hundred")
            buildWords(remainder, words)
        } else if (number < 1000000) {
            val thousands = number.div(1000)
            val remainder = number % 1000
            words.append(" ").append(buildWords(thousands, StringBuilder())).append(" thousand")
            buildWords(remainder, words)
        } else {
            val millions = number.div(1000000)
            val remainder = number % 1000000
            words.append(" ").append(buildWords(millions, StringBuilder())).append(" million")
            buildWords(remainder, words)
        }
}