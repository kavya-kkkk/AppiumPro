package Pages;

import org.openqa.selenium.By;

import Core.BaseClass;
import Core.ElementActions;
import io.appium.java_client.AppiumBy;

	public class RaffleInstant extends BaseClass {
	    private By EnternowBtnLuxury= AppiumBy.xpath("(//android.widget.TextView[@text=\"Enter now\"])[3]");
	    private By addTicketBtn= AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]");
	    private By removeTicketBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]");
	    private By ticketDropdown = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup");
	    private By addToCartBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	    private By TicektSelector = AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket Selector\"]");
	   
	//upsellcart popup    
	    private By upsellPopupRemoveBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"\"]");
	    private By backToRaffleBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Car\"]");
	    private By viewCartBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Other\"]");
	    private By enterNowUpsellBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	    private ElementActions elementActions;
	    
	    
	    //cart page 
	    
	    private By cartPageBackBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	    private By removeRaffleFromCartBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"\"]");
	    private By showEnterisBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"show entries\"]");
	    private By checkoutBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]");
	    private By promoCodeTextField = AppiumBy.xpath("//android.widget.EditText[@text=\"enter promo code\"]");
	    private By promocodeApplyBtn = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
	    private By creditCheckBox = AppiumBy.xpath("//android.widget.CheckBox");
	    //private By enterNowUpsellBtn = AppiumBy.xpath("//android.widge");
	    
	    //vivawallet
	    private By cardNumberTextField = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"card-number\"]");
	    private By ExpiredDateTextField = AppiumBy.xpath("//android.view.View[@text=\"Expiration Date\"]");
	    private By CVVTextField = AppiumBy.xpath("//android.view.View[@text=\"CVV\"]");
	    private By RememeberThisCardCheckbox = AppiumBy.xpath("//android.view.View[@text=\"remember-card Remember this card\"]");
	    private By PayBtn = AppiumBy.xpath("//android.widget.Button[@resource-id=\"pay-btn\"]");
	   // private By CVVTextField = AppiumBy.xpath("//android.view.View[@text=\"CVV\"]");
	    //purchase successfulpahe
	    
	    private By ContinueBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"CONTINUE\"]");
	    private By viewMyTickets = AppiumBy.xpath("//android.widget.TextView[@text=\"view my tickets\"]");
	    
	    //menu page 
	    private By menuRemoveBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"\"]");
	    private By ActiveRaffleLink = AppiumBy.xpath("//android.widget.TextView[@text=\"You have tickets in 1 active raffle\"]");
	    private By StoreLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Use your Raffolux points to redeem prizes in the Store\"]");
	    private By homeBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Home\"]");
	    private By myTicketsBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"My Tickets\"]");
	    private By myCreditBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"My Credit\"]");
	    private By storeBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Store\"]");
	    private By winnersBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Winners\"]");
	    private By referAfrdBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Refer a friend\"]");
	    private By charityBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Charity\"]");
	    private By personalInfoBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Personal Info\"]");
	    private By lightThemeToggleBtn = AppiumBy.xpath("//android.widget.Switch[@text=\"OFF\"]");
	    private By helpFAQBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Help & FAQs\"]");
	    private By logoutBtn = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]");
	    private By termLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Terms | \"]");
	    private By privacyLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Privacy | \"]");
	    private By helpLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Help | \"]");
	    private By responsibleLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Responsible Play\"]");
	    private By facebookLink = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	    private By twitterLink = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	    private By instagramLink = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView");
	    private By linkedInLink = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView");
	  //  private By responsibleLink = AppiumBy.xpath("//android.widget.TextView[@text=\"Responsible Play\"]");
	    
	    
	    //points store
	    
	    
	    private By pointstoreBackBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	    private By earnedtabBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Earned\"]");
	    private By storetabBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Store\"]");
	   
	    private By siteCredit5Prize= AppiumBy.xpath("//android.widget.TextView[@text=\"£5 Site Credit\"]");
	    private By  siteCredit10Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"£10 Site Credit\"]");
	    private By siteCredit15Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"£15 Site Credit\"]");
	    private By  siteCredit20Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 Site Credit\"]");
	    private By  amazon50Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"Amazon Firestick\"]");
	    private By AmazonFireStickPrize= AppiumBy.xpath("//android.widget.TextView[@text=\"£5 Site Credit\"]");
	    private By appleAirTagPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"Apple Air Tag\"]");
	    private By Airpods3rdPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"3rd Gen Airpods\"]");
	    private By DeliverooPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 at Deliveroo\"]");
	    private By  amazon20Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 at Amazon\"]");
	    private By TkMaxxPrize= AppiumBy.xpath("//android.widget.TextView[@text=\"£20 TK Maxx Voucher\"]");
	    private By justEatPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 Just Eat Voucher\"]");
	    private By One4AllPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 at One4All\"]");
	    private By fibitPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"Fitbit Charge 5\"]");
	    private By EchoDotPrize= AppiumBy.xpath("//android.widget.TextView[@text=\"Echo Dot 5th Gen\"]");
	    private By NinjaPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"Ninja Air Fryer\"]");
	    private By ASOSPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 ASOS Voucher\"]");
	    private By NikePrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 Nike Voucher\"]"); 
	    private By zaraPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 Zara Voucher\"]");
	    private By ArgosPrize= AppiumBy.xpath("//android.widget.TextView[@text=\"£20 Argos Voucher\"]");
	    private By BMPrize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 B&M Voucher\"]");
	    private By JD20Prize = AppiumBy.xpath("//android.widget.TextView[@text=\"£20 JD Voucher\"]");
	    
}
