import java.util.Random;

public class MagicBox<T> {
    protected T[] magicBox;
    Random random = new Random();

    public MagicBox(int size) {
        magicBox = (T[]) new Object[size];
    }

    protected boolean add(T item) {
        for (int i = 0; i < magicBox.length; i++) {
            if (magicBox[i] == null) {
                magicBox[i] = item;
                return true;
            }
        }
        return false;
    }

    protected T pick() {
        T element = null;
        int count = magicBox.length;
        for (int i = 0; i < magicBox.length; i++) {
            if (magicBox[i] == null) {
                throw new RuntimeException("Коробка не полна! Осталось пустыми еще " + count + " ячеек!");
            } else {
                count -= 1;
                int randomInt = random.nextInt(magicBox.length);
                element = magicBox[randomInt];
            }
        }
        return element;
    }
}

