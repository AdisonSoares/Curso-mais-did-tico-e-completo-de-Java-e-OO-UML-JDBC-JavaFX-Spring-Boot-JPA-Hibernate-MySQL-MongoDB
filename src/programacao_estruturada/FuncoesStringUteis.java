package programacao_estruturada;

import java.util.List;

public class FuncoesStringUteis {
    static void main() {
        //1) Tamanho da String - length()
        String nome = "Java Programacao Estrutura";
        System.out.println(nome.length());// 26

        //2) Caracter por índice
        String texto = "Java Programacao Estrutura";
        char c = texto.charAt(0);
        System.out.println(c); // 'J'

        //3) substring(int start) / substring(int start, int end) - Subcadeia extrai para String
        String frase = "Java Programacao Estrutura";
        System.out.println(frase.substring(9));// ramacao Estrutura
        System.out.println(frase.substring(0, 7));// Java Pr

        //4) toUpperCase() / toLowerCase() — Maiúsculas e minúsculas
        String s = "Java Programacao Estrutura";
        System.out.println(s.toUpperCase());//JAVA PROGRAMACAO ESTRUTURA
        System.out.println(s.toLowerCase());//java programacao estrutura

        //5) trim() remove espaços nas extremidades; strip() é mais moderno e suporta Unicode.
        String com_espacos = "   Java Programacao Estrutura   ";
        System.out.println(com_espacos);
        System.out.println(com_espacos.trim());
        System.out.println(com_espacos.strip());

        //6) contains(CharSequence s) — Verifica se a string contém uma sequência de caracteres.
        String email = "usuario@gmail.com";
        System.out.println(email.contains("@"));//true
        System.out.println(email.contains(".com"));//true
        System.out.println(email.contains(".br"));//false

        //7) startsWith() / endsWith() — Início e fim
        String arquivo = "arquivo_2026.txt";
        System.out.println(arquivo.startsWith("arquivo"));//true
        System.out.println(arquivo.endsWith(".txt"));//true
        System.out.println(arquivo.startsWith("2026"));//false
        System.out.println(arquivo.endsWith("2026"));//false

        //8) indexOf() / lastIndexOf() — Posição de caractere ou substring
        String teste = "banana";
        System.out.println(teste.indexOf("a"));// 1 (primeira ocorrencia)
        System.out.println(teste.lastIndexOf("a"));// 5 (ultima ocorrencia)

        //9) replace() / replaceAll() — Substituição
        //replace() troca literal; replaceAll() usa expressões regulares (regex).
        String fraseReplace01 = "O gato comeu o rato";
        System.out.println(fraseReplace01);
        System.out.println(fraseReplace01.replace("gato", "cachorro"));//"O cachorro comeu o rato"
        String cpf = "123.456.789-00";
        System.out.println(cpf.replaceAll("[.\\-]", ""));// "12345678900"

        //10) split(String regex) — Divide a string em um array baseado em um delimitador.
        String csv = "maça, banana, laranja, uva";
        String[] frutas = csv.split(",");
        for (String fruta : frutas) {
            System.out.println(fruta);//maça, banana, laranja, uva
        }

        //11) equals() / equalsIgnoreCase() — Comparação ⚠️ Nunca use == para comparar Strings em Java! Use equals().
        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));// false - compara exatamente como está
        System.out.println(s1.equalsIgnoreCase(s2));// true - ignora maiúsculas/minúsculas

        //12) compareTo() / compareToIgnoreCase() — Comparação lexicográfica - Retorna 0 se iguais, negativo se menor,
        // positivo se maior (útil para ordenação).
        String a = "Aplle";
        String b = "Banana";
        System.out.println(a.compareTo(b));// negativo (A vem antes de B)
        System.out.println(b.compareTo(a));// positivo

        //13) isEmpty() / isBlank() — Verificar vazio
        String vazia = "";
        String espacos = " ";
        System.out.println(vazia.isEmpty());// true
        System.out.println(espacos.isEmpty());// false
        System.out.println(espacos.isBlank());// true  (verifica só espaços também)

        //14) valueOf() — Converter outros tipo de dados para String.
        int numero = 42;
        double pi = 3.14;
        boolean flag = true;

        System.out.println(String.valueOf(numero));// "42"
        System.out.println(String.valueOf(pi));// "3.14"
        System.out.println(String.valueOf(flag));// "true"

        //15)  format() — Formatar string. Cria strings formatadas, similar ao printf.
        String nomeFormat = "Maria";
        int idade = 30;
        double salario = 4500.50;

        String resultado = String.format("Nome: %s | Idade: %d | Salario: R$ %.2f", nomeFormat, idade, salario);
        System.out.println(resultado); // Nome: Maria | Idade: 30 | Salário: R$ 4500,50

        //16) join() — Unir strings - Junta elementos com um delimitador.
        String resultadoJoin = String.join(" - ", "Java", "Python", "C++", "Go");
        System.out.println(resultadoJoin);// "Java - Python - C++ - Go"

        List<String> listaNomes = List.of("SP", "RJ", "MG");
        System.out.println(String.join(", ", listaNomes));// "SP, RJ, MG"

        //17) toCharArray() — Converter para array de chars
        String palavraParaChar = "Java";
        char[] letras = palavraParaChar.toCharArray();
        for (char l : letras){
            System.out.println(l + " "); // J a v a
        }

        //18) matches(String regex) — Validar com regex - Verifica se a string corresponde a um padrão.
        String cep = "12345-678";
        String emailMatches = "teste@dominio.com";

        System.out.println(cep.matches("\\d{5}-\\d{3}"));              // true
        System.out.println(emailMatches.matches("[\\w.]+@[\\w.]+\\.\\w+"));   // true

    }
}
