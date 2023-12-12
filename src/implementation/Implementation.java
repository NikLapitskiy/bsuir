package implementation;
import marketing.*;

public class Implementation {
    public static void main(String[] args) {
        // проверка работаспособности программы
        SocialMediaAdv socialMediaAdv = new SocialMediaAdv();
        socialMediaAdv.createCampaign();
        socialMediaAdv.createAd();
        socialMediaAdv.createSocialMediaCampaignWithAgency();
        socialMediaAdv.createEmailCampaign();
        socialMediaAdv.createMultiChannelCampaign();
        socialMediaAdv.createSocialMediaCampaignWithAgency();
        System.out.println();

        ContentAdv contentAdv = new ContentAdv();
        contentAdv.createCampaign();
        contentAdv.createContent();
        contentAdv.createContentForEmail();
        contentAdv.createEmailCampaign();
        contentAdv.createSocialMediaPost();
    }
}