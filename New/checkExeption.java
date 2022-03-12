package New;

public class checkExeption extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // Default no-arg constructor
    public checkExeption() {
        super();
    }

    public checkExeption(String msg) {
        super(msg);
    }
}
