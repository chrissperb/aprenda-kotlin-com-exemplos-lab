enum class Level { BASICO, INTERMEDIARIO, AVANCADO }

data class User(
    val name: String,
    var cpf: String,
    var zipCode: String,
    val email: String,
    private var password: String,
    var completedContents: MutableList<EducationalContent> = mutableListOf()
) {
    init {
        require(name.isNotBlank()) { "O nome não pode estar vazio." }
        require(email.isNotBlank()) { "O email não pode estar vazio." }
        require(password.isNotBlank()) { "A senha não pode estar vazia." }
        require(cpf.isNotBlank()) { "O CPF não pode estar vazio." }
        require(cpf.matches("\\d{11}".toRegex())) { "O CPF deve ter 11 dígitos numéricos." }
    }

    fun getPassword(): String {
        return password
    }

    fun setPassword(newPassword: String) {
        password = newPassword
    }

    fun markContentAsCompleted(content: EducationalContent) {
        completedContents.add(content)
    }
}

data class EducationalContent(
    val name: String,
    val level: Level,
    val duration: Int
)

data class Formation(
    val name: String,
    var contents: MutableList<EducationalContent>,
    var registeredUsers: MutableList<User> = mutableListOf()
) {

    fun addContent(newContent: EducationalContent) {
        contents.add(newContent)
    }

    fun enroll(user: User) {
        registeredUsers.add(user)
    }
}

fun main() {
    val formation = Formation("Programação Kotlin", mutableListOf())

    // Para criar conteúdos educacionais
    val content1 = EducationalContent("Introdução ao Kotlin", Level.BASICO, 10)
    val content2 = EducationalContent("Programação Orientada a Objetos em Kotlin", Level.INTERMEDIARIO, 15)

    // Para adicionar conteúdos à formação
    formation.addContent(content1)
    formation.addContent(content2)

    // Imprimindo os conteúdos da formação
    println("Conteúdos da formação ${formation.name}:")
    for (content in formation.contents) {
        println(" - ${content.name} (${content.level}) - ${content.duration} horas")
    }

    val user1 = User("Chris", "12345678901", "12345-678", "chris@email.com", "senha123")
    val user2 = User("Cintia", "98765432109", "98765-432", "cintia@email.com", "senha456")

    user1.markContentAsCompleted(content1)
    user2.markContentAsCompleted(content2)

    // Matriculando usuários na formação
    formation.enroll(user1)
    formation.enroll(user2)

    // Imprimindo os usuários matriculados na formação
    println("\nUsuários matriculados na formação ${formation.name}:")
    for (user in formation.registeredUsers) {
        println(" - ${user.name} (${user.email})")
    }

    // Mostrando os cursos concluídos pelos usuários
    for (user in formation.registeredUsers) {
        println("\nCursos concluídos por ${user.name}:")
        for (content in user.completedContents) {
            println(" - ${content.name} (${content.level}) - ${content.duration} horas")
        }
    }
}
