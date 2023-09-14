public class TesteLivroDeNotas{
  static public void main(String args []){
    //nome completamente qualificado da classe
    String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da disciplina");
    // inferência de tipo
    //var: somente a partir do Java 10
    var livroDeNotas = new LivroDeNotas(nomeDisciplina);
    // livroDeNotas.nomeDisciplina = nomeDisciplina;
    //enviando a mensagem "exibirMensagem" ao objeto livroDeNotas
    livroDeNotas.exibirMensagem();
    System.out.println("Até logo");
  }
}