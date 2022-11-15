
import java.io.Serializable;

public class Student implements Serializable {

    private String nim;
    private String name;
    private String address;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "nim=" + nim + ", name=" + name + ", address=" + address + '}';
    }
}
