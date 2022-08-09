public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(5);
        magicBox.add("Olya");
        magicBox.add("Kolya");
        magicBox.add("Sveta");
        magicBox.add("Misha");
        magicBox.add("Vera");

        System.out.println(magicBox.pick());

        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        magicBox1.add(4);
        magicBox1.add(6);
        magicBox1.add(3);
        magicBox1.add(8);
        magicBox1.add(9);
        magicBox1.add(1);

        System.out.println(magicBox1.pick());
    }
}
