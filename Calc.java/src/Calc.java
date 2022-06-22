import java.util.Scanner;

public class Calc {
    static public void main (String[]args){

        Scanner Scan=new Scanner(System.in);

        Numero n1=new Numero(0);
        Numero n2=new Numero(0);
        Numero resp=new Numero(0);

        String opc="S";
        while (opc.equals("S") || opc.equals("s")) {
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(Scan.nextInt());

            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(Scan.nextInt());

            resp.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nSoma de %d com %d e igual a %d: ", n1.getValor(), n2.getValor(), resp.getValor());
            System.out.printf("%nDeseja realizar outra operacao ? ");
            opc=Scan.next();
            System.out.printf("%n%n%n");
        }




    }

}
