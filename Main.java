package Builder;

public class Main {

    public static void main(String[] args) {

        User user = new User
                .UserBuilder("Gruby", "Mietek")
                .phone("29317")
                .address("Pararira").build();

    }
}
