import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        customerDatabase.put(1, new Customer(1, "Alice"));
        customerDatabase.put(2, new Customer(2, "Bob"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDatabase.get(id);
    }
}

