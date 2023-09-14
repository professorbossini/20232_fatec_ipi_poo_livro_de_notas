public class LivroDeNotas{
  //variável de instância
  //instância é sinônimo de objeto
  String nomeDisciplina;
  
  public void exibirMensagem(){
    System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDisciplina);
  }

  // construtor padrão (aquele cuja lista de parâmetros é vazia)
  LivroDeNotas(String nomeDisciplina){
    // shadowing
    this.nomeDisciplina = nomeDisciplina;
  }
}