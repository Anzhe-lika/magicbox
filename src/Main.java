public class Main {
        public static void main(String[] args) {
            MagicBox<String> names = new MagicBox<>(5);
            names.add("star");
            names.add("heart");
            names.add("circle");
            names.add("diamond");
            names.add("oval");

            System.out.println(names.pick());

            MagicBox<Integer> volume = new MagicBox<>(5);
            volume.add(25);
            volume.add(18);
            volume.add(9);
            volume.add(94);
            volume.add(17);

            System.out.println(volume.pick());
        }
    }