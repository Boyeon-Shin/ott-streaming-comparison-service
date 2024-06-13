import java.util.Map;
import java.util.TreeMap;

public class OTTService {
    TreeMap<String, OTTPrices> ottMap;

    //    private list<String> contents;
    public OTTService() {
        this.ottMap = new TreeMap<>();
    }

    // OTT 종류 추가
    public void addOTT(String ottName, double basicPrice, double standardPrice, double premiumPrice) {
        OTTPrices prices = new OTTPrices(basicPrice, standardPrice, premiumPrice);
        ottMap.put(ottName.toLowerCase(), prices);
    }

    // 특정 OTT 서비스의 가격 업데이트
    public void updatePrice(String ottName, String type, double price) {
        OTTPrices prices = ottMap.get(ottName.toLowerCase());
        if (prices != null) {
            prices.setPrice(type.toLowerCase(), price);
        }
    }

    // OTT 종류별 정보 출력
    public void printOTTDetails() {
        for (Map.Entry<String, OTTPrices> entry : ottMap.entrySet()) {
            System.out.println("-----------------------------------");
            System.out.println("OTT: " + entry.getKey());
            System.out.println("Basic Price: " + entry.getValue().getBasicPrice());
            System.out.println("Standard Price: " + entry.getValue().getStandardPrice());
            System.out.println("Premium Price: " + entry.getValue().getPremiumPrice());
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }

    public void printOTTDetailsOttName(String ottName) {
        OTTPrices prices = ottMap.get(ottName.toLowerCase());
        if (prices != null) {
            System.out.println("-----------------------------------");
            System.out.println("OTT: " + ottName);
            System.out.println("Basic Price(1명): " + prices.getBasicPrice());
            System.out.println("Standard Price(2명): " + prices.getStandardPrice());
            System.out.println("Premium Price(4명): " + prices.getPremiumPrice());
            System.out.println("-----------------------------------");
            System.out.println();
        } else {
            System.out.println("정보가 없습니다");
        }
    }


    // OTT 가격 정보를 관리하는 내부 클래스
    public class OTTPrices {
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
            }
        }
    }
}
