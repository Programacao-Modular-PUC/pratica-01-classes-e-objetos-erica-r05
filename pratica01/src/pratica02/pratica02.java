import pratica02.Data;
import pratica02.Pessoa;

public static void main(String[] Args){

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Pessoa[] pessoas = new Pessoa[10];
    int count = 0;

    for(int i = 0; i < 10; i++){

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = sc.nextLine();

        if(i > 0){
            Pessoa anterior = pessoas[i-1];

            if(nome.trim().equalsIgnoreCase(anterior.getNome().trim()) &&
                    sobrenome.trim().equalsIgnoreCase(anterior.getSobrenome().trim())){
                break;
            }
        }

        System.out.println("Digite dia nascimento:");
        int dia = sc.nextInt();

        System.out.println("Digite mes nascimento:");
        int mes = sc.nextInt();

        System.out.println("Digite ano nascimento:");
        int ano = sc.nextInt();

        System.out.println("Digite altura:");
        double altura = sc.nextDouble();

        System.out.println("Digite peso:");
        double peso = sc.nextDouble();
        sc.nextLine();

        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setSobrenome(sobrenome);
        p.setAltura(altura);
        p.setPeso(peso);

        Data d = new Data(dia,mes,ano);
        p.setData_nascimento(d);

        pessoas[i] = p;
        count++;
    }

    for(int i = 0; i < count; i++){

        Pessoa p = pessoas[i];

        String classificacao = p.InformaObesidade(p.CalculaIMC(p.getPeso(), p.getAltura()));

        System.out.println("\nCadastro " + (i+1) + ":");
        System.out.println("Nome completo: " + p.getNome() + " " + p.getSobrenome());

        String ref = p.getSobrenome() + ", " + p.getNome().toUpperCase();
        System.out.println("Nome de referência: " + ref);

        System.out.println("Idade: " + p.calculaIdade());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("IMC: %.2f\\n " + p.CalculaIMC(p.getPeso(), p.getAltura()) );
        System.out.println("Classificação: " + classificacao);
    }

}