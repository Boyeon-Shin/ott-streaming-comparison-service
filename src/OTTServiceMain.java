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
    public void printOTTDetails() {
        for (Map.Entry<String, OTTPrices> entry : ottMap.entrySet()) {
            System.out.println("OTT: " + entry.getKey());
            System.out.println("Basic Price: " + entry.getValue().getBasicPrice());
            System.out.println("Standard Price: " + entry.getValue().getStandardPrice());
            System.out.println("Premium Price: " + entry.getValue().getPremiumPrice());
            System.out.println();
        }
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

    // 예시 사용
    public static void main(String[] args) {
        OTTServiceMain service = new OTTServiceMain();
        service.addOTT("Netflix", 0, 13.99, 17.99);
        service.addOTT("Amazon Prime Video", 5.99, 10.99, 14.99);
        service.addOTT("Disney+", 6.99, 11.99, 15.99);

        service.printOTTDetails();

        service.updatePrice("Netflix", "standard", 15.99);
        service.updatePrice("Disney+", "basic", 7.99);

        System.out.println("Updated Prices:");
        service.printOTTDetails();

    }
}
