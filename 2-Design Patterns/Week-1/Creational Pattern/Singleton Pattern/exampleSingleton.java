public class exampleSingleton{ // lazy construction
    // the class instance is null if no instance is instantiated
    private static exampleSingleton uniqueInstance = null;

    private exampleSingleton(){};

    // lazy construction of instance
    public static exampleSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new exampleSingleton();
        }
        return uniqueInstance;
    }

    ////////////////////////////////////////
    public static void main(String args[]){
        // exampleSingleton singleton = new exampleSingleton();
        // singleton.getInstance();
        // System.out.println("Singleton instance created");

        exampleSingleton singleton = exampleSingleton.getInstance();
        System.out.println("Singleton instance created");
    }
}

