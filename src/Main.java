public class Main {
    public static void main(String[] args) {

        Author erichRemarque = new Author("Эрих", "Ремарк");
        Book threeLoads = new Book("Три товарища", erichRemarque, 1936);
        System.out.println(threeLoads);

        System.out.println("");

        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", mikhailBulgakov, 1967);

        System.out.println(theMasterAndMargarita);

    }
}