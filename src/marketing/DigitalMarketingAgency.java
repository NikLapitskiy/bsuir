package marketing;

class DigitalMarketingAgency extends MarketingAgency {
    @Override
    public void createCampaign() {
        System.out.println("Цифровое маркетинговое агенство создало кампанию");
    }

    @Override
    public void createAd() {
        System.out.println("Доваблено");
    }

    @Override
    void manageClient() {
        System.out.println("Цифровое маркетинговое агенство обслуживает клиента");
    }
}