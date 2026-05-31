public abstract interface Live {
    //this is abstract method
    public abstract void speak ();

    //this is default method
    public default void sleep () {
        System.out.println("sleeping..");
    }
}
