package Models;

public class Contact<T,U> {
//-------------------------------------------------------------------------------
    private T name;
    private U phone;
//-------------------------------------------------------------------------------
    public Contact(T name, U phone) {

        this.name = name;
        this.phone = phone;
    }
//-------------------------------------------------------------------------------
    public T getName() {
        return name;
    }

    public U getPhone() {
        return phone;
    }
//-------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "\nContact [Nombre= " + name + ", Telefono= " + phone + "]";
    }
//-------------------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Contact<?, ?> other = (Contact<?, ?>) obj;
        
        return this.name.equals(other.name);
    }
}
