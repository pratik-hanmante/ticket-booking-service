package ticket.booking.services;

import ticket.booking.entities.User;

import java.io.File;

public class UserBookingService
{
    private User user;

    private static final String USERS_PATH= "../localDB/users.json";

    public UserBookingService(User user1) {
        //stores the user's data in the user 
            this.user= user1;
        File users = new File(USERS_PATH);
    }
}
