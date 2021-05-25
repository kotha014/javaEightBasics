package MapVsFlatMap;

import java.util.List;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<Integer> mobileNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public Customer(int id, String name, String email, List<Integer> mobileNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() && getName().equals(customer.getName()) && getEmail().equals(customer.getEmail()) && getMobileNumber().equals(customer.getMobileNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getMobileNumber());
    }

    public List<Integer> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<Integer> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
