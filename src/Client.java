public class Client {
    String name;
    String secondName;
    String surname;
    int age;
    String dateOfBirth;

    public Client(String name, String secondName, String surname, int age, String dateOfBirth) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void getClientInfo() {
        System.out.println(name + " " + secondName + " " + surname + " " + age + " " + dateOfBirth);
    }

}
