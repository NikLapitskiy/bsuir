package marketing;

public class SocialMediaAdv extends EmailAdvertiser implements SocialMediaAdvertiser, MultiChannelAdvertiser{
    @Override
    void createEmailAdv(){
        System.out.println("Создана реклама по email для рекламы через соцсети");
    }

    @Override
    public void createAd() {
        System.out.println("Добавлена");
    }

    @Override
    public void createContent() {
        System.out.println("Контент создан для соцсетей создан");
    }

    @Override
    public void createEmailCampaign() {
        System.out.println("Создана кампания рекламы по email для рекламы через соцсети");
    }

    @Override
    public void createCampaign() {
        System.out.println("Создана кампания рекламы для рекламы через соцсети");
    }

    @Override
    public void createSocialMediaPost() {
        System.out.println("Опубликован пост в соцсетях");
    }

    @Override
    public void createMultiChannelCampaign() {
        System.out.println("Реклама запущена по всем направлениям");
    }

    @Override
    public void createSocialMediaCampaignWithAgency() {
        System.out.println("Запущена реклама в соцсетях через агенство");
    }
}
