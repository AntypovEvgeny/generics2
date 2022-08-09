import java.util.Random;

public class MagicBox<T> {

    protected T[] items;

    protected int randomInt;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                throw new RuntimeException("Есть ячейки равные нулю в количестве " + (items.length - i) + " !");
            } else {
                Random random = new Random();
                int randomInt = random.nextInt(items.length);
            }
        }
        return items[randomInt];
    }
}