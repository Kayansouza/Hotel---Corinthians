
import model.Cliente
import model.Usuario
import model.funcionario
import repository.UsuarioRepository

fun main() {
    inicio()

    }

fun inicio () {


    println("Escolha uma opção:")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarcliente()
        2 -> EntrarComSenha()
        3 -> AbastecimentoDeAutomoveis()
        4 ->
        4 -> sairDoHotel()
        else -> erro()
    }

    // Criando o cadastro do cliente, onde o usuário irá informar os dados para se cadastrar no hotel. O cadastro é feito através da função inicio(), onde o usuário é solicitado a informar seu nome, cpf, email, telefone e senha. Esses dados são armazenados em variáveis locais e depois utilizados para criar um objeto do tipo cliente, utilizando o construtor da classe cliente. O objeto criado é armazenado na variável pessoa.

    print("Bem vindo ao Hotel Bando De Loucos!\n")

    println("Por favor, informe o seu nome:")
    var nome = readln()

    println("Digite o CPF:")
    var cpf = readln()

    println("Por favor, informe o email:")
    var email = readln()

    println("Por favor, informe o telefone:")
    var telefone = readln()

    println("Por favor, informe a senha:")
    var senha = readln()

    // instanciando um objeto do tipo cliente, utilizando o construtor da classe cliente. O construtor recebe os parâmetros nome, cpf, email e telefone e os atribui às propriedades correspondentes da classe cliente. O objeto criado é armazenado na variável pessoa.

    var pessoa = Cliente(nome, cpf, email, telefone,senha)
    var user = Usuario(nome, cpf, email, telefone,senha)
    var roxo = funcionario()

}

fun   cadastrarcliente {

}

fun  EntrarComSenha {

}