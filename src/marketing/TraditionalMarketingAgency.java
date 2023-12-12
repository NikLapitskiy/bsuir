package marketing;

class TraditionalMarketingAgency extends MarketingAgency {
    @Override
    public void createCampaign() {
        System.out.println("Традиционное маркетиноговое агенство объявило кампанию");
    }

    @Override
    public void createAd() {
        System.out.println("Добавлено");
    }

    @Override
    void manageClient() {
        System.out.println("Обслужить клиента");
    }
}