package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {//
        UserService userDaoHibernate = new UserServiceImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.saveUser("Ivan", "Ivanov", (byte) 5);
        userDaoHibernate.getAllUsers();
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}
