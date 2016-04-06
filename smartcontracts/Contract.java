package smartcontracts;

public interface Contract {
    String getAddress();
    void execute(String... args);
}
