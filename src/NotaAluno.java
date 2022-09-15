import java.util.Scanner;

public class NotaAluno {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n1,n2,n3,n4, media;
        System.out.println("Informe a primeira nota: ");
        n1 = s.nextDouble();

        System.out.println("Informe a Segunda nota: ");
        n2 = s.nextDouble();

        System.out.println("Informe a Terceira nota: ");
        n3 = s.nextDouble();

        System.out.println("Informe a Quarta nota: ");
        n4 = s.nextDouble();

        media = (n1+n2+n3+n4)/4;

        if (media >= 7) {
            System.out.println("ESTÁ APROVADO, média do aluno é: " + media);
        } else if (media >= 5){
                System.out.println("ESTÁ DE RECUPERAÇÃO, média do aluno é: " + media);
        }   else {
            System.out.println("ESTÁ REPROVADO, média do aluno é: " + media);

        }

        s.close();
    }



}
