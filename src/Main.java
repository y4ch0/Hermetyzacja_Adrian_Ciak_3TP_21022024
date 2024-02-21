public class Main {
    public static void main(String[] args) {
        Client clOne = new Client("Adrian","","Ciak",18,"2006-03-03");
        Account accOne = new Account(clOne.name, clOne.secondName, clOne.surname, clOne.age, clOne.dateOfBirth,1,1000,"Regular",1234);
        accOne.getClientInfo();
        accOne.updtAccBal(1234,100);
        accOne.updtPin(1234,4321);
    }
}