import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@Suppress("DANGEROUS_CHARACTERS")
class KataTest {
    private lateinit var fixture: Kata

    @BeforeEach
    fun setUp() {
        fixture = Kata()
    }

    @Test
    fun `0 should return "zero"`() {
        assertEquals("zero", fixture.numberToWords(0))
    }

    @Test
    fun `1 should return "one"`() {
        assertEquals("one", fixture.numberToWords(1))
    }

    @Test
    fun `5 should return "five"`() {
        assertEquals("five", fixture.numberToWords(5))
    }

    @Test
    fun `8 should return "eight"`() {
        assertEquals("eight", fixture.numberToWords(8))
    }

    @Test
    fun `10 should return "ten"`() {
        assertEquals("ten", fixture.numberToWords(10))
    }

    @Test
    fun `19 should return "nineteen"`() {
        assertEquals("nineteen", fixture.numberToWords(19))
    }

    @Test
    fun `20 should return "twenty"`() {
        assertEquals("twenty", fixture.numberToWords(20))
    }

    @Test
    fun `21 should return "twenty-one"`() {
        assertEquals("twenty-one", fixture.numberToWords(21))
    }

    @Test
    fun `30 should return "thirty"`() {
        assertEquals("thirty", fixture.numberToWords(30))
    }

    @Test
    fun `77 should return "seventy-seven"`() {
        assertEquals("seventy-seven", fixture.numberToWords(77))
    }

    @Test
    fun `99 should return "ninety-nine"`() {
        assertEquals("ninety-nine", fixture.numberToWords(99))
    }

    @Test
    fun `100 should return "one hundred"`() {
        assertEquals("one hundred", fixture.numberToWords(100))
    }

    @Test
    fun `101 should return "one hundred one"`() {
        assertEquals("one hundred one", fixture.numberToWords(101))
    }

    @Test
    fun `303 should return "three hundred three"`() {
        assertEquals("three hundred three", fixture.numberToWords(303))
    }

    @Test
    fun `555 should return "five hundred fifty-five"`() {
        assertEquals("five hundred fifty-five", fixture.numberToWords(555))
    }

    @Test
    fun `999 should return "nine hundred ninety-nine"`() {
        assertEquals("nine hundred ninety-nine", fixture.numberToWords(999))
    }

    @Test
    fun `1000 should return "one thousand"`() {
        assertEquals("one thousand", fixture.numberToWords(1000))
    }

    @Test
    fun `1001 should return "one thousand one"`() {
        assertEquals("one thousand one", fixture.numberToWords(1001))
    }

    @Test
    fun `1019 should return "one thousand nineteen"`() {
        assertEquals("one thousand nineteen", fixture.numberToWords(1019))
    }

    @Test
    fun `1099 should return "one thousand ninety-nine"`() {
        assertEquals("one thousand ninety-nine", fixture.numberToWords(1099))
    }

    @Test
    fun `2000 should return "two thousand"`() {
        assertEquals("two thousand", fixture.numberToWords(2000))
    }

    @Test
    fun `3466 should return "three thousand four hundred sixty-six"`() {
        assertEquals("three thousand four hundred sixty-six", fixture.numberToWords(3466))
    }

    @Test
    fun `2400 should return "two thousand four hundred"`() {
        assertEquals("two thousand four hundred", fixture.numberToWords(2400))
    }

    @Test
    fun `10000 should return "ten thousand"`() {
        assertEquals("ten thousand", fixture.numberToWords(10000))
    }

    @Test
    fun `900000 should return "nine hundred thousand"`() {
        assertEquals("nine hundred thousand", fixture.numberToWords(900000))
    }

    @Test
    fun `999999 should return "nine hundred ninety-nine thousand nine hundred ninety-nine"`() {
        assertEquals("nine hundred ninety-nine thousand nine hundred ninety-nine", fixture.numberToWords(999999))
    }

    @Test
    fun `999999999 should return "nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine"`() {
        assertEquals("nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine", fixture.numberToWords(999999999))
    }
}