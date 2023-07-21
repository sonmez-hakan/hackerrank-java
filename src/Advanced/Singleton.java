package Advanced;

class Singleton {
    private static Singleton instance = null;

    public String str;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }

        return Singleton.instance;
    }
}