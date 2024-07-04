import java.util.Scanner;
public class nivel_heroi{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome;
            int xp;

            System.out.println("Digite o nome do seu heroi: ");
            nome = scanner.nextLine();

            System.out.println("Digite a quantidade de xp do personagem: ");
            xp = scanner.nextInt();

            if (xp<=1000) {
                System.out.println("O herói "+nome+" está no nível Ferro com "+xp+" de xp");
            }else if (xp>=1001 && xp<=2000){
                System.out.println("O herói "+nome+" está no nível Bronze com "+xp+" de xp");
            }else if (xp>=2001 && xp<=5000) {
                System.out.println("O herói "+nome+" está no nível Prata com "+xp+" de xp");
            }else if (xp>=5001 && xp<=7000) {
                System.out.println("O herói "+nome+" está no nível Ouro com "+xp+" de xp");
            }else if (xp>=7001 && xp<=8000) {
                System.out.println("O herói "+nome+" está no nível Platina com "+xp+" de xp");
            }else if (xp>=8001 && xp<=9000) {
                System.out.println("O herói "+nome+" está no nível Ascendente com "+xp+" de xp");
            }else if (xp>=9001 && xp<=10000) {
                System.out.println("O herói "+nome+" está no nível Imortal com "+xp+" de xp");
            }else{
                System.out.println("O herói "+nome+" está no nível Radiante com "+xp+" de xp");
            }
        }
    }
}