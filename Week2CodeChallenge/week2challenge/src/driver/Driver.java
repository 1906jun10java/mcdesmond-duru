package driver;

import java.sql.Connection;

public class Driver {

public static void main(String[] args) {
	Connection connection = Connectting.getConnection();
}
}
