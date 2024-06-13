import java.util.*;

public class OTTServiceMain {
    private TreeMap<String, OTTPrices> ottMap;

    public OTTServiceMain() {
        this.ottMap = new TreeMap<>();
    }

    // OTT 종류 추가
    public void addOTT(String ottName, double basicPrice, double standardPrice, double premiumPrice) {
        OTTPrices prices = new OTTPrices(basicPrice, standardPrice, premiumPrice);
        ottMap.put(ottName, prices);
    }

    // 특정 OTT 서비스의 가격 업데이트
    public void updatePrice(String ottName, String type, double price) {
        OTTPrices prices = ottMap.get(ottName);
        if (prices != null) {
            prices.setPrice(type, price);
        }
    }

    // OTT 종류별 정보 출력
    public boolean printOTTDetails() {
        for (Map.Entry<String, OTTPrices> entry : ottMap.entrySet()) {
            System.out.println("OTT: " + entry.getKey());
            System.out.println("Basic Price: " + entry.getValue().getBasicPrice());
            System.out.println("Standard Price: " + entry.getValue().getStandardPrice());
            System.out.println("Premium Price: " + entry.getValue().getPremiumPrice());
            System.out.println();
        }
        return false;
    }

    public boolean printOTTDetailsOttName(String ottName) {
            OTTPrices prices = ottMap.get(ottName);
            if(prices != null) {
                System.out.println("OTT: " + ottName);
                System.out.println("Basic Price: " + prices.getBasicPrice());
                System.out.println("Standard Price: " + prices.getStandardPrice());
                System.out.println("Premium Price: " + prices.getPremiumPrice());
                System.out.println();
            }else {
                System.out.println("정보가 없습니다");
            }
            return false;
    }


    // OTT 가격 정보를 관리하는 내부 클래스
    private class OTTPrices {
        private double basicPrice; // 베이직 가격
        private double standardPrice; // 스탠다드 가격
        private double premiumPrice; // 프리미엄 가격

        public OTTPrices(double basicPrice, double standardPrice, double premiumPrice) {
            this.basicPrice = basicPrice;
            this.standardPrice = standardPrice;
            this.premiumPrice = premiumPrice;
        }

        public double getBasicPrice() {
            return basicPrice;
        }

        public double getStandardPrice() {
            return standardPrice;
        }

        public double getPremiumPrice() {
            return premiumPrice;
        }

        public double getTypePrice(String type) {
            switch (type) {
                case "basic":
                    return basicPrice;
                case "standard":
                    return standardPrice;
                case "premium":
                    return premiumPrice;
                default:
                    return 0;
            }
        }


        public void setPrice(String type, double price) {
            switch (type.toLowerCase()) {
                case "basic":
                    this.basicPrice = price;
                    break;
                case "standard":
                    this.standardPrice = price;
                    break;
                case "premium":
                    this.premiumPrice = price;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid price type: " + type);
            }
        }
    }

    //OTT 최신 컨텐츠 목록 관리하는 정보


    // 예시 사용
    public static void main(String[] args) {
        OTTServiceMain service = new OTTServiceMain();
        service.addOTT("Netflix", 9500, 13500, 17000);
        service.addOTT("Disney+", 9900, 0, 13900);
        service.addOTT("CoupangPlay", 4900, 4900, 4900);
        service.addOTT("Tving", 7900, 10900, 13900);
        service.addOTT("Wave", 7900, 10900, 13900);

//        service.printOTTDetails();

//        service.updatePrice("Netflix", "standard", 15.99);
//        service.updatePrice("Disney+", "basic", 7.99);

//        System.out.println("Updated Prices:");
//        service.printOTTDetails();


        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 OTT를 고르세요(Netflix,Disney,CoupangPlay,Tving,Wave):");
        String ottName = scanner.next();
        if(service.ottMap.get(ottName) == null) {
            System.out.println("정보가 없습니다");
            scanner.close();
        } else {
            System.out.println("type을 고르세요 basic,standard,premium 전체보기를 원하면 all");

            String type = scanner.next();
            if (type.equals("all")) {
                System.out.println(service.printOTTDetailsOttName(ottName));
            } else {
                System.out.println(type + ": " + service.ottMap.get(ottName).getTypePrice(type));
            }
        }
    }


}
