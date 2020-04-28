import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TemperatureConverterTest {

    @Test
    fun `should convert the 0F to around -17,8C`() {
        val temperatureConverter = TemperatureConverter()

        val converted = temperatureConverter.fahrenheitToCelsius(0f)

        assertEquals(-17.8f, converted , 0.1f)
    }
}