public class Main {
    public static void main(String[] args) {

        for (Month month: Month.values()) {
            System.out.println (month.name() + ' ' + month.ordinal());
        }
    }
}