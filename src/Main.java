public class Main {

    public static void main(String[] args) {

        MagicBox<String> firstBox = new MagicBox<>(6);

        firstBox.add("15");
        firstBox.add("Denis");
        firstBox.add("Irina");
        firstBox.add("5");

        firstBox.pick();
    }
}