public class Main {

    public static void main(String[] args) {

        MagicBox<Integer> firstBox = new MagicBox<>(new Integer[10]);

        firstBox.add(15);
        firstBox.add(14);
        firstBox.add(3);
        firstBox.add(5);

        firstBox.pick();
    }
}