class UpdateEmail(private val repo: ClientRepo) {
    operator fun invoke(clientId: Int, newEmail: String) {
        repo.setEmail(clientId, newEmail)
    }
}
