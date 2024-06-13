import java.util.Scanner;

public class OTTServiceMain {
    public static void main(String[] args) {
        OTTService service = new OTTService();
        service.addOTT("Netflix", 9500, 13500, 17000);
        service.addOTT("Disney+", 9900, 0, 13900);
        service.addOTT("CoupangPlay", 4900, 4900, 4900);
        service.addOTT("Tving", 7900, 10900, 13900);
        service.addOTT("Wave", 7900, 10900, 13900);


//        service.updatePrice("Netflix", "standard", 15.99);
//        service.updatePrice("Disney+", "basic", 7.99);
//        System.out.println("Updated Prices:");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 OTT를 고르세요(Netflix,Disney+,CoupangPlay,Tving,Wave) 또는 exit:");

            String ottName = scanner.next().trim().toLowerCase();
            if (ottName.equals("exit")) {
                break;
            } else if (service.ottMap.get(ottName.toLowerCase()) == null) {
                System.out.println("정보가 없습니다");
            } else {
                System.out.println("type을 고르세요 basic,standard,premium 전체보기를 원하면 all");
                String type = scanner.next();
                if (type.equals("all")) {
                    service.printOTTDetailsOttName(ottName);
                } else {
                    System.out.println(type + ": " + service.ottMap.get(ottName).getTypePrice(type));
                }
            }
        }
    }
}
