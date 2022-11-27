public class atributos {
    private String nome;
    private int idade;
    private float valor1;
    private float valor2;
    private float total;

    public atributos(){
        this.idade= idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getValor1() {
        return valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public float getTotal() {
        return total;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 18){
            System.out.println("Menor de Idade");
        }else{
            System.out.println("Maior de idade");
        }
        this.idade = idade;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public void calculaTotal(float total) {
        this.total = total;
        total = valor1 + valor2;
    }

    public String mostrar(){
        return "Nome: "+ nome + "\nIdade: " + idade + "\nSaldo 1: " + valor1 + "\nSaldo 2: "+ valor2
                + "\nTotal: "+ total;
    }
}


