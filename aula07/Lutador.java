package aula07;
public class Lutador {
// ATRIBUTOS
    private String nome , nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;
 
//MÉTODOS Publicos

    public void apresentar (){
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA! APRENSENTAMOS O GRANDE LUTADOR "+ this.getNome());
        System.out.println("DIRETAMENTE DO: " + this.getNacionalidade());
        System.out.println("COM :" + this.getIdade() + " Anos E "+ this.getAltura()+ " DE ALTURA" );
        System.out.println("PESANDO " + this.getPeso() + "KG");
        System.out.println("GANHOU: " + this.getVitorias());
        System.out.println("PERDEU: " + this.getDerrotas()+"  e,  ");
        System.out.println("EMPATOU: " + this.getEmpates());
    }
    
    public void status() {
        System.out.println("---------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("SENDO UM PESO: " + this.getCategoria());
        System.out.println(""+this.getVitorias() + " VITORIAS");
        System.out.println(""+this.getDerrotas() + " DERROTAS");
        System.out.println(""+this.getEmpates() + " EMPATES");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
    
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

// MÉTODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if( this.peso < 52.2) {
            this.categoria = "NÃO PODE PARTICIPAR, PESO MUITO BAIXO";
        } else if (this.peso <= 70.3) {
            this.categoria = "LEVE";
        } else if (this.peso <= 83.9) {
            this.categoria = "MÉDIO";
        } else if (this.peso <=120.2) {
            this.categoria = "PESADO";
        } else {
            this.categoria = "NÃO PODE PARTICIPAR, MUITO PESADO";
        }
    }
          
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    
  
}
