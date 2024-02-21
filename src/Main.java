public class Main {
    public static void main(String[] args) {
        Client clOne = new Client("Adrian","","Ciak",18,"2006-03-03");
        Account accOne = new Account(clOne.name, clOne.secondName, clOne.surname, clOne.age, clOne.dateOfBirth,1,12000,"Regular",1234);
        accOne.getClientInfo();
        accOne.updtAccBal(1234,329.99);
        accOne.updtPin(1234,4321);
        Client clTwo = new Client("Adrian","","Ciak",18,"2006-03-03");
        Account accTwo = new Account(clTwo.name, clTwo.secondName, clTwo.surname, clTwo.age, clTwo.dateOfBirth,1,12000,"Regular",1234);
        accTwo.getClientInfo();
        accTwo.updtAccBal(1234,329.99);
        accTwo.updtPin(1234,4321);
        Client clThree = new Client("Adrian","","Ciak",18,"2006-03-03");
        Account accThree = new Account(clThree.name, clThree.secondName, clThree.surname, clThree.age, clThree.dateOfBirth,1,12000,"Regular",1234);
        accThree.getClientInfo();
        accThree.updtAccBal(1234,329.99);
        accThree.updtPin(1234,4321);
    }
}