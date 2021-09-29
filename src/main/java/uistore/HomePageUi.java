package uistore;

import org.openqa.selenium.By;

public class HomePageUi {
	
	public By signicon= By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg");
	public By signupopt= By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > ul > li:nth-child(2) > a");
	public By signmail= By.xpath("//*[@id=\"spree_user_email\"]");
	public By signpass= By.cssSelector("#spree_user_password");
	public By signsubmit= By.xpath("//*[@id=\"signup_form\"]/input[4");
	public By signerror= By.xpath("//*[@id=\"ulerrors\"]/ul/li");
	public By loginopt= By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");
	public By clicksearchBox=By.id("search");
	public By clicksearchButton=By.id("search_button");
	public By closingpopup=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	public By chairCheck1=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img");
	public By aboutus=By.cssSelector("#footer-links > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a");
	public By aboutladder=By.xpath("//*[@id=\"page_content\"]/div[1]/div/p[2]");
	public By recliner=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(1)");
	public By recliner1=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/a/img");
	public By recliner1price=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[3]/a/div[2]/span");
	public By bookshelf=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(4) > svg");
	public By bookshelf1=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/a/img");
	public By addtocart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	public By cofeetable=By.xpath("//*[@id=\"content\"]/div[3]/div/div[2]/a[7]");
	public By pinterest=By.className("icofont-social-pinterest");
	public By followers=By.xpath("//*[@id=\"mweb-unauth-container\"]/div/div[1]/div/div/div[5]/div[1]/div");
	public By StudyTable=By.cssSelector("[href=\"/study-table?src=explore_categories\"]");
	public By productCount=By.cssSelector("[class=\"results-count\"]");
	public By Checkbox=By.cssSelector("[id=\"filters_availability_In_Stock_Only\"]");
	public By sales=By.className("featuredLinksBar__link");
	public By hydsale=By.cssSelector("[src=\"https://www.ulcdn.net/media/furniture-stores/hyderabad/kondapur/Store_Hyderabad.jpg?1583496326\"]");
	public By address=By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/div[5]/a");
	public By addressget=By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[9]/div[1]/button/div[1]/div[2]/div[1]");
	public By email1=By.id("spree_user_email");
	public By pass1=By.cssSelector("#spree_user_password");
	public By orderid=By.name("orderNumber");
	public By phno=By.name("phoneNumber");
	public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	public By sofafinish=By.cssSelector("[data-group=\"finish\"]");
	public By checked=By.id("filters_primary_colors_Blues");
	
	public By firstTv=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/a/div[2]/span");
	public By TvUnits=By.cssSelector("a[href=\"/tv-units?src=explore_categories\"]");
	public By tvname=By.cssSelector("a[	title=\"Zephyr Large TV Unit (Teak Finish)\"]");
	public By gift=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
	public By dc=By.xpath("//h5[normalize-space()='Digital Cards']");
	public By insta=By.className("icofont-social-twitter");
	public By posts=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[2]/a/span[1]/span");
	public By Item=By.cssSelector("a[data-id=\"94869\"]");
	public By addcart=By.id("add-to-cart-button");
	public By quantity=By.id("select_0_quantity");
	public By price=By.className("final-price");
	public By chat=By.id("fc_widget");
	public By cchat=By.className("icon-ic_chat_icon");
	public By chatwithus=By.className("channel-name");
	public By chattext=By.id("app-conversation-editor");
	public By email=By.id("spree_user_email");
	public By pass=By.id("spree_user_password");

	
	public By store=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	public By more=By.cssSelector("[href=\"/locations?src=footer\"]");
}

