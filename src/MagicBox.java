import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int size;
    Random random = new Random();

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
        this.items = items;
        this.size = size;
    }

    public boolean add(T item) {
        for (int i = 0; i < size; i++) {
             if (items[i] == null) {
                items[i] = item;
                System.out.println(item + " добавлен в коробку.");
                return true;
            }
        }
        System.out.println("Коробка полна");
            return false;
    }

    public T pick() throws RuntimeException {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count++;
            }
        }

        if (count != 0) {
            throw new RuntimeException("Осталось незаполненных ячеек " + count + " шт.");
        }
        int randomInt = random.nextInt(items.length);
        System.out.println(items[randomInt]);
        return items[randomInt];
    }
}
