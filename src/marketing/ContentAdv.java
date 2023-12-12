package marketing;

public class ContentAdv implements ContentAdvertiser, MultiChannelAdvertiser{

    @Override
    public void createContentForEmail() {
        System.out.println("Создан контент для email для рекламы через контент");
    }

    @Override
    public void createContent() {
        System.out.println("Создан контент для рекламы");
    }

    @Override
    public void createEmailCampaign() {
        System.out.println("Создана кампания для email для рекламы через контент");
    }

    @Override
    public void createCampaign() {
        System.out.println("Создана кампания для рекламы через контент");
    }

    @Override
    public void createMultiChannelCampaign() {
        System.out.println("Создана кампания по всем каналам для рекламы через контент");
    }

    @Override
    public void createSocialMediaPost() {
        System.out.println("Созданы посты в соцсетях для рекламы через контент");
    }
}
