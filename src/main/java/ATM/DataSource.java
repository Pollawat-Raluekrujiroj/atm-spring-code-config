package ATM;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
