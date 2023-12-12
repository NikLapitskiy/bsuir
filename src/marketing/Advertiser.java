package marketing;

class Advertiser implements Advertising {
    @Override
    public void createCampaign() {
        System.out.println("Создана рекламная кампания");
    }

    @Override
    public void createAd() {
        System.out.println("Добавлено");
    }
}