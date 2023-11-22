package HomeWork_from_LMS;

public class Main {
    public static void main(String[] args) {
        System.out.println(TransportType.CAR + " автоунаанын бир километринин баасы $"+TransportType.CAR.calculateTravelCost(120));
        System.out.println(TransportType.BUS + " автобустун бир километринин баасы $"+TransportType.BUS.calculateTravelCost(300));
        System.out.println(TransportType.TRUCK + " трак учун бир километринин баасы $"+TransportType.TRUCK.calculateTravelCost(250));
    }
}
