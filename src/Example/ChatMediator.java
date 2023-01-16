package Example;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator{

    private List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u: this.userList) {
            //message should not be received by the user sending it
            if (u != user)
                u.receive(msg);
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
