package Example;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImp(mediator, "Jason");
        User user2 = new UserImp(mediator, "George");
        User user3 = new UserImp(mediator, "Alina");
        User user4 = new UserImp(mediator, "Seby");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
