public class TEST {

    public static void main(String[] args) {
        test();
    }

    public static void test() {

        try {
            System.out.println(Class.forName("fr.xibalba.utils.annotations.BuilderProcessor").getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}