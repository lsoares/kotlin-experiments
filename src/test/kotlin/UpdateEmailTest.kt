import io.mockk.*
import org.junit.jupiter.api.Test

class UpdateEmailTest {

    @Test
    fun `should call the data layer to update customer`() {
        val repo = mockk<ClientRepo> {
            every { setEmail(42, "new@email.com") } just Runs
        }
        val updateEmail = UpdateEmail(repo)

        updateEmail(42, "new@email.com")

        verify { repo.setEmail(42, "new@email.com") }
    }
}