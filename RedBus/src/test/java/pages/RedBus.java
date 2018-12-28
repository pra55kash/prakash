package pages;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    
    
    @FindBy(css = "a[href='/info/aboutus']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='https://in3.seatseller.travel/']")
    @CacheLookup
    private WebElement agentRegistration;

    @FindBy(css = "a[href='/travels/operators-directory.aspx']")
    @CacheLookup
    private WebElement allOperators;

    @FindBy(css = "a[href='https://www.redbus.in/travels/amarnath-travels-9984.aspx']")
    @CacheLookup
    private WebElement amarnathTravels;

    @FindBy(css = "a[title='APSRTC']")
    @CacheLookup
    private WebElement apsrtc;

    @FindBy(css = "a[href='https://www.redbus.in/travels/arthi-travels.aspx']")
    @CacheLookup
    private WebElement arthiTravels;

    @FindBy(css = "a[title='Bangalore Bus Tickets']")
    @CacheLookup
    private WebElement bangaloreBusTickets;

    @FindBy(css = "a[title='Bangalore Hebbal Hotels']")
    @CacheLookup
    private WebElement bangaloreHebbalHotels;

    @FindBy(css = "a[title='Bangalore SilkBoard Hotels']")
    @CacheLookup
    private WebElement bangaloreSilkboardHotels;

    @FindBy(css = "a[title='Bangalore to Chennai Bus']")
    @CacheLookup
    private WebElement bangaloreToChennaiBus;

    @FindBy(css = "a[href='https://www.redbus.in/travels/bengal-tiger.aspx']")
    @CacheLookup
    private WebElement bengalTiger;

    @FindBy(css = "a[href='http://blog.redbus.in/']")
    @CacheLookup
    private WebElement blog;

    @FindBy(id = "Book_btn")
    @CacheLookup
    private WebElement bookNow1;

    @FindBy(id = "Book_btn")
    @CacheLookup
    private WebElement bookNow2;

    @FindBy(css = "a.site-links.gtm-busHire")
    @CacheLookup
    private WebElement busHire;

    @FindBy(css = "a[href='/careers']")
    @CacheLookup
    private WebElement careers;

    @FindBy(css = "a.site-links.cars")
    @CacheLookup
    private WebElement carsOutstation;

    @FindBy(css = "a[href='https://www.redbus.in/travels/chartered-bus.aspx']")
    @CacheLookup
    private WebElement charteredSpeedBus;

    @FindBy(css = "a[title='Chennai Bus Tickets']")
    @CacheLookup
    private WebElement chennaiBusTickets;

    @FindBy(css = "a[title='Chennai Koyambed Hotels']")
    @CacheLookup
    private WebElement chennaiKoyambedHotels;

    @FindBy(css = "a[href='https://www.redbus.co']")
    @CacheLookup
    private WebElement colombia;

    @FindBy(css = "a[href='/info/contactus']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='https://www.redbus.in/travels/eagle-travels.aspx']")
    @CacheLookup
    private WebElement eagleTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/evacay-bus.aspx ']")
    @CacheLookup
    private WebElement evacayBus;

    @FindBy(css = "a[href='/info/faq']")
    @CacheLookup
    private WebElement faq;

    @FindBy(id = "src")
    @CacheLookup
    private WebElement from;

    @FindBy(css = "a[href='https://www.redbus.in/travels/ganesh-travels-2.aspx']")
    @CacheLookup
    private WebElement ganeshTravels;

    @FindBy(css = "a[title='GSRTC']")
    @CacheLookup
    private WebElement gsrtc;

    @FindBy(css = "a[href='https://www.redbus.in/travels/gujarat-travels.aspx']")
    @CacheLookup
    private WebElement gujaratTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/hebron-transports.aspx']")
    @CacheLookup
    private WebElement hebronTransports;

    @FindBy(css = "a[href='/info/redcare']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a.site-links.gtm-hotels")
    @CacheLookup
    private WebElement hotels;

    @FindBy(css = "a[title='HRTC']")
    @CacheLookup
    private WebElement hrtc;

    @FindBy(css = "a[href='https://www.redbus.in/travels/humsafar-travels-9807.aspx']")
    @CacheLookup
    private WebElement humsafarTravels;

    @FindBy(css = "a[title='Hyderabad Bus Tickets']")
    @CacheLookup
    private WebElement hyderabadBusTickets;

    @FindBy(css = "a[title='Hyderabad to Bangalore Bus']")
    @CacheLookup
    private WebElement hyderabadToBangaloreBus;

    @FindBy(css = "a[href='https://www.redbus.in']")
    @CacheLookup
    private WebElement india;

    @FindBy(css = "a[href='https://www.redbus.id']")
    @CacheLookup
    private WebElement indonesia;

    @FindBy(css = "a[href='https://www.redbus.in/travels/infant-jesus.aspx']")
    @CacheLookup
    private WebElement infantJesus;

    @FindBy(css = "a[href='https://www.icicilombard.com/']")
    @CacheLookup
    private WebElement insurancePartner;

    @FindBy(css = "a[href='https://www.redbus.in/travels/jabbar-travels.aspx']")
    @CacheLookup
    private WebElement jabbarTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/jain-travels.aspx']")
    @CacheLookup
    private WebElement jainTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/jakhar-travels.aspx']")
    @CacheLookup
    private WebElement jakharTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/jbt-travels.aspx']")
    @CacheLookup
    private WebElement jbtTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/kaleswari-travels.aspx']")
    @CacheLookup
    private WebElement kaleswariTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/kallada-travels-kallada.aspx ']")
    @CacheLookup
    private WebElement kalladaTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/kanker-roadways-10172.aspx']")
    @CacheLookup
    private WebElement kankerRoadways;

    @FindBy(css = "a.know_more_btn")
    @CacheLookup
    private WebElement knowMore1;

    @FindBy(css = "a.know_more")
    @CacheLookup
    private WebElement knowMore2;

    @FindBy(css = "a[href='https://www.redbus.in/travels/komitla.aspx']")
    @CacheLookup
    private WebElement komitla;

    @FindBy(css = "a[href='https://www.redbus.in/travels/kpn-travels-kpn.aspx ']")
    @CacheLookup
    private WebElement kpnTravels;

    @FindBy(css = "a[title='KTCL']")
    @CacheLookup
    private WebElement ktcl;

    @FindBy(css = "a[href='https://www.redbus.in/travels/madurai-radha-travels.aspx']")
    @CacheLookup
    private WebElement maduraiRadhaTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/mahalaxmi-travels-mahalaxmi.aspx']")
    @CacheLookup
    private WebElement mahalaxmiTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/mahasagar-travels-mahasagar.aspx']")
    @CacheLookup
    private WebElement mahasagarTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/mahendra-travels-10027.aspx']")
    @CacheLookup
    private WebElement mahendraTravels;

    @FindBy(css = "a[href='https://www.redbus.my']")
    @CacheLookup
    private WebElement malaysia;

    @FindBy(css = "a[href='https://www.redbus.in/travels/manish-travels.aspx']")
    @CacheLookup
    private WebElement manishTravels;

    @FindBy(css = "a[href='https://eyefortravelblog.blogspot.in/2014/04/winners-of-mobile-innovation-in-travel.html']")
    @CacheLookup
    private WebElement mobileInnovationAward;

    @FindBy(css = "a[href='//m.redbus.in']")
    @CacheLookup
    private WebElement mobileVersion;

    @FindBy(css = "a[title='More >']")
    @CacheLookup
    private WebElement more1;

    @FindBy(css = "a[href='/online-booking/rtc-directory.aspx']")
    @CacheLookup
    private WebElement more2;

    @FindBy(css = "a[href='/buses/cities-directory.aspx']")
    @CacheLookup
    private WebElement more3;

    @FindBy(css = "a[href='https://www.redbus.in/online-booking/rtc-directory.aspx']")
    @CacheLookup
    private WebElement more4;

    @FindBy(css = "a[href='http://www.business-standard.com/article/companies/bs-annual-awards-saluting-the-spirit-of-entrepreneurship-114033100015_1.html']")
    @CacheLookup
    private WebElement mostInnovativeCompany;

    @FindBy(css = "a[href='https://thebrandtrustreport.wordpress.com/tag/redbus-in/']")
    @CacheLookup
    private WebElement mostTrustedBrand;

    @FindBy(css = "a[href='https://www.redbus.in/travels/mr-travels.aspx']")
    @CacheLookup
    private WebElement mrTravels;

    @FindBy(css = "a[title='MSRTC']")
    @CacheLookup
    private WebElement msrtc;

    @FindBy(css = "a[title='Mumbai to Bangalore Bus']")
    @CacheLookup
    private WebElement mumbaiToBangaloreBus;

    @FindBy(css = "a[href='https://www.redbus.in/travels/neeta-tours-and-travels.aspx']")
    @CacheLookup
    private WebElement neetaToursAndTravels;

    @FindBy(css = "#rh_main div:nth-of-type(3) div.exit-btns-grp button:nth-of-type(2)")
    @CacheLookup
    private WebElement no;

    @FindBy(css = "a[href='/info/OfferTerms']")
    @CacheLookup
    private WebElement offers;

    @FindBy(id = "onward_cal")
    @CacheLookup
    private WebElement onwardDate;

    @FindBy(css = "a[href='https://www.redbus.in/travels/orange-travels-orange.aspx ']")
    @CacheLookup
    private WebElement orangeTravels;

    private final String pageLoadedText = "redBus is the world's largest online bus ticket booking service trusted by over 8 million happy customers globally";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='https://www.redbus.in/travels/parveen-travels.aspx ']")
    @CacheLookup
    private WebElement parveenTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/patel-tours-and-travels.aspx']")
    @CacheLookup
    private WebElement patelToursAndTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/patel-travels-lufthanza-9940.aspx']")
    @CacheLookup
    private WebElement patelTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/paulo-travels.aspx']")
    @CacheLookup
    private WebElement pauloTravels;

    @FindBy(css = "a[title='PEPSU']")
    @CacheLookup
    private WebElement pepsu;

    @FindBy(css = "a[href='https://www.redbus.pe']")
    @CacheLookup
    private WebElement peru;

    @FindBy(css = "a[title='pilgrimages']")
    @CacheLookup
    private WebElement pilgrimages;

    @FindBy(css = "a[href='https://www.redbus.in/travels/pradhan.aspx']")
    @CacheLookup
    private WebElement pradhanTravels;

    @FindBy(css = "a[href='/info/privacypolicy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[title='Pune Bus Tickets']")
    @CacheLookup
    private WebElement puneBusTickets;

    @FindBy(css = "a[title='Pune Hadapsar Hotels']")
    @CacheLookup
    private WebElement puneHadapsarHotels;

    @FindBy(css = "a[title='Pune to Bangalore Bus']")
    @CacheLookup
    private WebElement puneToBangaloreBus;

    @FindBy(css = "a[title='Pune Wakad Hotels']")
    @CacheLookup
    private WebElement puneWakadHotels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/raj-express-1.aspx']")
    @CacheLookup
    private WebElement rajExpress;

    @FindBy(css = "a[href='https://www.redbus.in/travels/rajdhani-express.aspx ']")
    @CacheLookup
    private WebElement rajdhaniExpress;

    @FindBy(css = "a.redbus-logo.home-redirect")
    @CacheLookup
    private WebElement redbus;

    @FindBy(css = "a[href='/info/mobile']")
    @CacheLookup
    private WebElement redbusOnMobile;

    @FindBy(css = "a.selectedBus.site-links")
    @CacheLookup
    private WebElement restPromotionswrapmarginleft44pxmargintop96pxCntendTimnamecolor333CountinfoPositionHeight123embusTickets;

    @FindBy(id = "return_cal")
    @CacheLookup
    private WebElement returnDate;

    @FindBy(css = "a[href='https://www.redbus.in/travels/royal-travels.aspx']")
    @CacheLookup
    private WebElement royalTravels;

    @FindBy(css = "a[title='RSRTC']")
    @CacheLookup
    private WebElement rsrtc;

    @FindBy(id = "search_btn")
    @CacheLookup
    private WebElement searchBuses;

    @FindBy(css = "a[href='https://www.redbus.in/travels/sharma-travels.aspx']")
    @CacheLookup
    private WebElement sharmaTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/shatabdi-travels-1.aspx']")
    @CacheLookup
    private WebElement shatabdiTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/shrinath-travels-agency-online.aspx']")
    @CacheLookup
    private WebElement shrinathTravels;

    @FindBy(css = "a[href='https://www.redbus.sg']")
    @CacheLookup
    private WebElement singapore;

    @FindBy(css = "a[href='/sitemap.html']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "sendLinkButton")
    @CacheLookup
    private WebElement smsMeTheLink;

    @FindBy(id = "upphoneCode")
    @CacheLookup
    private WebElement smsSentWithDownloadLink1;

    @FindBy(id = "smsTXTBOX")
    @CacheLookup
    private WebElement smsSentWithDownloadLink2;

    @FindBy(css = "a[href='https://www.redbus.in/travels/sri-krishna-travels.aspx']")
    @CacheLookup
    private WebElement sriKrishnaTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/srm-travels-srm.aspx']")
    @CacheLookup
    private WebElement srmTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/srs-travels-srs.aspx']")
    @CacheLookup
    private WebElement srsTravels;

    @FindBy(css = "a[href='/info/termscondition']")
    @CacheLookup
    private WebElement tC;

    @FindBy(id = "dest")
    @CacheLookup
    private WebElement to;

    @FindBy(css = "a[href='https://www.redbus.in/travels/universal-travels.aspx']")
    @CacheLookup
    private WebElement universalTravels;

    @FindBy(css = "a[title='UPSRTC']")
    @CacheLookup
    private WebElement upsrtc;

    @FindBy(css = "a[href='https://www.redbus.in/travels/vaibhav-travels.aspx']")
    @CacheLookup
    private WebElement vaibhavTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/verma-travels.aspx']")
    @CacheLookup
    private WebElement vermaTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/vivegam-travels.aspx']")
    @CacheLookup
    private WebElement vivegamTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/vrl-travels-vrl.aspx']")
    @CacheLookup
    private WebElement vrlTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/vst.aspx']")
    @CacheLookup
    private WebElement vstTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/yamani-travels.aspx']")
    @CacheLookup
    private WebElement yamaniTravels;

    @FindBy(css = "a[href='https://www.redbus.in/travels/ybm-travels.aspx']")
    @CacheLookup
    private WebElement ybmTravels;

    @FindBy(id = "exit-reschedule")
    @CacheLookup
    private WebElement yes;

    public RedBus() {
    }

    public RedBus(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public RedBus(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public RedBus(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Agent Registration Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickAgentRegistrationLink() {
        agentRegistration.click();
        return this;
    }

    /**
     * Click on All Operators Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickAllOperatorsLink() {
        allOperators.click();
        return this;
    }

    /**
     * Click on Amarnath Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickAmarnathTravelsLink() {
        amarnathTravels.click();
        return this;
    }

    /**
     * Click on Apsrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickApsrtcLink() {
        apsrtc.click();
        return this;
    }

    /**
     * Click on Arthi Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickArthiTravelsLink() {
        arthiTravels.click();
        return this;
    }

    /**
     * Click on Bangalore Bus Tickets Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBangaloreBusTicketsLink() {
        bangaloreBusTickets.click();
        return this;
    }

    /**
     * Click on Bangalore Hebbal Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBangaloreHebbalHotelsLink() {
        bangaloreHebbalHotels.click();
        return this;
    }

    /**
     * Click on Bangalore Silkboard Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBangaloreSilkboardHotelsLink() {
        bangaloreSilkboardHotels.click();
        return this;
    }

    /**
     * Click on Bangalore To Chennai Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBangaloreToChennaiBusLink() {
        bangaloreToChennaiBus.click();
        return this;
    }

    /**
     * Click on Bengal Tiger Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBengalTigerLink() {
        bengalTiger.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Book Now Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBookNow1Button() {
        bookNow1.click();
        return this;
    }

    /**
     * Click on Book Now Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBookNow2Button() {
        bookNow2.click();
        return this;
    }

    /**
     * Click on Bus Hire Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickBusHireLink() {
        busHire.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Cars Outstation Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickCarsOutstationLink() {
        carsOutstation.click();
        return this;
    }

    /**
     * Click on Chartered Speed Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickCharteredSpeedBusLink() {
        charteredSpeedBus.click();
        return this;
    }

    /**
     * Click on Chennai Bus Tickets Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickChennaiBusTicketsLink() {
        chennaiBusTickets.click();
        return this;
    }

    /**
     * Click on Chennai Koyambed Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickChennaiKoyambedHotelsLink() {
        chennaiKoyambedHotels.click();
        return this;
    }

    /**
     * Click on Colombia Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickColombiaLink() {
        colombia.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Eagle Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickEagleTravelsLink() {
        eagleTravels.click();
        return this;
    }

    /**
     * Click on Evacay Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickEvacayBusLink() {
        evacayBus.click();
        return this;
    }

    /**
     * Click on Faq Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickFaqLink() {
        faq.click();
        return this;
    }

    /**
     * Click on Ganesh Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickGaneshTravelsLink() {
        ganeshTravels.click();
        return this;
    }

    /**
     * Click on Gsrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickGsrtcLink() {
        gsrtc.click();
        return this;
    }

    /**
     * Click on Gujarat Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickGujaratTravelsLink() {
        gujaratTravels.click();
        return this;
    }

    /**
     * Click on Hebron Transports Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHebronTransportsLink() {
        hebronTransports.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHotelsLink() {
        hotels.click();
        return this;
    }

    /**
     * Click on Hrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHrtcLink() {
        hrtc.click();
        return this;
    }

    /**
     * Click on Humsafar Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHumsafarTravelsLink() {
        humsafarTravels.click();
        return this;
    }

    /**
     * Click on Hyderabad Bus Tickets Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHyderabadBusTicketsLink() {
        hyderabadBusTickets.click();
        return this;
    }

    /**
     * Click on Hyderabad To Bangalore Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickHyderabadToBangaloreBusLink() {
        hyderabadToBangaloreBus.click();
        return this;
    }

    /**
     * Click on India Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickIndiaLink() {
        india.click();
        return this;
    }

    /**
     * Click on Indonesia Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickIndonesiaLink() {
        indonesia.click();
        return this;
    }

    /**
     * Click on Infant Jesus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickInfantJesusLink() {
        infantJesus.click();
        return this;
    }

    /**
     * Click on Insurance Partner Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickInsurancePartnerLink() {
        insurancePartner.click();
        return this;
    }

    /**
     * Click on Jabbar Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickJabbarTravelsLink() {
        jabbarTravels.click();
        return this;
    }

    /**
     * Click on Jain Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickJainTravelsLink() {
        jainTravels.click();
        return this;
    }

    /**
     * Click on Jakhar Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickJakharTravelsLink() {
        jakharTravels.click();
        return this;
    }

    /**
     * Click on Jbt Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickJbtTravelsLink() {
        jbtTravels.click();
        return this;
    }

    /**
     * Click on Kaleswari Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKaleswariTravelsLink() {
        kaleswariTravels.click();
        return this;
    }

    /**
     * Click on Kallada Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKalladaTravelsLink() {
        kalladaTravels.click();
        return this;
    }

    /**
     * Click on Kanker Roadways Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKankerRoadwaysLink() {
        kankerRoadways.click();
        return this;
    }

    /**
     * Click on Know More Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKnowMore1Link() {
        knowMore1.click();
        return this;
    }

    /**
     * Click on Know More Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKnowMore2Link() {
        knowMore2.click();
        return this;
    }

    /**
     * Click on Komitla Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKomitlaLink() {
        komitla.click();
        return this;
    }

    /**
     * Click on Kpn Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKpnTravelsLink() {
        kpnTravels.click();
        return this;
    }

    /**
     * Click on Ktcl Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickKtclLink() {
        ktcl.click();
        return this;
    }

    /**
     * Click on Madurai Radha Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMaduraiRadhaTravelsLink() {
        maduraiRadhaTravels.click();
        return this;
    }

    /**
     * Click on Mahalaxmi Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMahalaxmiTravelsLink() {
        mahalaxmiTravels.click();
        return this;
    }

    /**
     * Click on Mahasagar Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMahasagarTravelsLink() {
        mahasagarTravels.click();
        return this;
    }

    /**
     * Click on Mahendra Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMahendraTravelsLink() {
        mahendraTravels.click();
        return this;
    }

    /**
     * Click on Malaysia Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMalaysiaLink() {
        malaysia.click();
        return this;
    }

    /**
     * Click on Manish Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickManishTravelsLink() {
        manishTravels.click();
        return this;
    }

    /**
     * Click on Mobile Innovation Award Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMobileInnovationAwardLink() {
        mobileInnovationAward.click();
        return this;
    }

    /**
     * Click on Mobile Version Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMobileVersionLink() {
        mobileVersion.click();
        return this;
    }

  

    /**
     * Click on Most Innovative Company Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMostInnovativeCompanyLink() {
        mostInnovativeCompany.click();
        return this;
    }

    /**
     * Click on Most Trusted Brand Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMostTrustedBrandLink() {
        mostTrustedBrand.click();
        return this;
    }

    /**
     * Click on Mr Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMrTravelsLink() {
        mrTravels.click();
        return this;
    }

    /**
     * Click on Msrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMsrtcLink() {
        msrtc.click();
        return this;
    }

    /**
     * Click on Mumbai To Bangalore Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickMumbaiToBangaloreBusLink() {
        mumbaiToBangaloreBus.click();
        return this;
    }

    /**
     * Click on Neeta Tours And Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickNeetaToursAndTravelsLink() {
        neetaToursAndTravels.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickNoButton() {
        no.click();
        return this;
    }

    /**
     * Click on Offers Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickOffersLink() {
        offers.click();
        return this;
    }

    /**
     * Click on Orange Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickOrangeTravelsLink() {
        orangeTravels.click();
        return this;
    }

    /**
     * Click on Parveen Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickParveenTravelsLink() {
        parveenTravels.click();
        return this;
    }

    /**
     * Click on Patel Tours And Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPatelToursAndTravelsLink() {
        patelToursAndTravels.click();
        return this;
    }

    /**
     * Click on Patel Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPatelTravelsLink() {
        patelTravels.click();
        return this;
    }

    /**
     * Click on Paulo Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPauloTravelsLink() {
        pauloTravels.click();
        return this;
    }

    /**
     * Click on Pepsu Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPepsuLink() {
        pepsu.click();
        return this;
    }

    /**
     * Click on Peru Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPeruLink() {
        peru.click();
        return this;
    }

    /**
     * Click on Pilgrimages Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPilgrimagesLink() {
        pilgrimages.click();
        return this;
    }

    /**
     * Click on Pradhan Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPradhanTravelsLink() {
        pradhanTravels.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Pune Bus Tickets Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPuneBusTicketsLink() {
        puneBusTickets.click();
        return this;
    }

    /**
     * Click on Pune Hadapsar Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPuneHadapsarHotelsLink() {
        puneHadapsarHotels.click();
        return this;
    }

    /**
     * Click on Pune To Bangalore Bus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPuneToBangaloreBusLink() {
        puneToBangaloreBus.click();
        return this;
    }

    /**
     * Click on Pune Wakad Hotels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickPuneWakadHotelsLink() {
        puneWakadHotels.click();
        return this;
    }

    /**
     * Click on Raj Express Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRajExpressLink() {
        rajExpress.click();
        return this;
    }

    /**
     * Click on Rajdhani Express Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRajdhaniExpressLink() {
        rajdhaniExpress.click();
        return this;
    }

    /**
     * Click on Redbus Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRedbusLink() {
        redbus.click();
        return this;
    }

    /**
     * Click on Redbus On Mobile Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRedbusOnMobileLink() {
        redbusOnMobile.click();
        return this;
    }

    /**
     * Click on .Rest .Promotionswrapmarginleft44pxmargintop96px.cntend.timnamecolor333.countinfo .Position Height 1.23embus Tickets Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRestPromotionswrapmarginleft44pxmargintop96pxCntendTimnamecolor333CountinfoPositionHeight123embusTicketsLink() {
        restPromotionswrapmarginleft44pxmargintop96pxCntendTimnamecolor333CountinfoPositionHeight123embusTickets.click();
        return this;
    }

    /**
     * Click on Royal Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRoyalTravelsLink() {
        royalTravels.click();
        return this;
    }

    /**
     * Click on Rsrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickRsrtcLink() {
        rsrtc.click();
        return this;
    }

    /**
     * Click on Search Buses Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSearchBusesButton() {
        searchBuses.click();
        System.out.println("seaarch button clciked");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    /**
     * Click on Sharma Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSharmaTravelsLink() {
        sharmaTravels.click();
        return this;
    }

    /**
     * Click on Shatabdi Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickShatabdiTravelsLink() {
        shatabdiTravels.click();
        return this;
    }

    /**
     * Click on Shrinath Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickShrinathTravelsLink() {
        shrinathTravels.click();
        return this;
    }

    /**
     * Click on Singapore Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSingaporeLink() {
        singapore.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Sms Me The Link Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSmsMeTheLinkButton() {
        smsMeTheLink.click();
        return this;
    }

    /**
     * Click on Sri Krishna Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSriKrishnaTravelsLink() {
        sriKrishnaTravels.click();
        return this;
    }

    /**
     * Click on Srm Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSrmTravelsLink() {
        srmTravels.click();
        return this;
    }

    /**
     * Click on Srs Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickSrsTravelsLink() {
        srsTravels.click();
        return this;
    }

    /**
     * Click on T C Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickTCLink() {
        tC.click();
        return this;
    }

    /**
     * Click on Universal Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickUniversalTravelsLink() {
        universalTravels.click();
        return this;
    }

    /**
     * Click on Upsrtc Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickUpsrtcLink() {
        upsrtc.click();
        return this;
    }

    /**
     * Click on Vaibhav Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickVaibhavTravelsLink() {
        vaibhavTravels.click();
        return this;
    }

    /**
     * Click on Verma Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickVermaTravelsLink() {
        vermaTravels.click();
        return this;
    }

    /**
     * Click on Vivegam Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickVivegamTravelsLink() {
        vivegamTravels.click();
        return this;
    }

    /**
     * Click on Vrl Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickVrlTravelsLink() {
        vrlTravels.click();
        return this;
    }

    /**
     * Click on Vst Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickVstTravelsLink() {
        vstTravels.click();
        return this;
    }

    /**
     * Click on Yamani Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickYamaniTravelsLink() {
        yamaniTravels.click();
        return this;
    }

    /**
     * Click on Ybm Travels Link.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickYbmTravelsLink() {
        ybmTravels.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the RedBus class instance.
     */
    public RedBus clickYesButton() {
        yes.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the RedBus class instance.
     */
    public RedBus fill() {
        setFromTextField();
        setToTextField();
        setOnwardDateTextField();
        setReturnDateTextField();
        setSmsSentWithDownloadLink1TextField();
        setSmsSentWithDownloadLink2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the RedBus class instance.
     */
    public RedBus fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to From Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setFromTextField() {
        return setFromTextField(data.get("FROM"));
    }

    /**
     * Set value to From Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setFromTextField(String fromValue) {
    	
        from.sendKeys(fromValue);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='search']//ul//li[text()='"+fromValue+"']")).click();
        return this;
    }

    /**
     * Set default value to Onward Date Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setOnwardDateTextField() {
        return setOnwardDateTextField(data.get("ONWARD_DATE"));
    }

    /**
     * Set value to Onward Date Text field.
     *
     * @return the RedBus class instance.
     * @throws ParseException 
     */
    public RedBus setOnwardDateTextField(String onwardDateValue)  {
    	Actions actions=new Actions(driver);
    	actions.moveToElement(onwardDate).click().build().perform();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.findElement(By.id("rb-calendar_onward_cal")).isDisplayed();
    	
    	// actions.moveToElement(datemonth).perform();
    	
    	String[] date = onwardDateValue.split("-");
    	String day = date[0];
    	String mon = date[1];
    	String year = date[2];
SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
Date tdate=null;
try {
	tdate = sdf.parse(onwardDateValue);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    	Date today=new Date();
    	
    	
    	

while(true) {
	System.out.println("input  "+mon+" "+year);
	 WebElement datemonth = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='monthTitle']"));
	 System.out.println(datemonth.getText());
	if( datemonth.getText().equalsIgnoreCase(mon+" "+year)) {
		break;
	}else {		
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='next']/button")).click();
		}
	}


String da="//*[@id='rb-calendar_onward_cal']//td[text()='"+day+"']";
driver.findElement(By.xpath(da)).click();
        //onwardDate.sendKeys(onwardDateValue);
        return this;
    }

    /**
     * Set default value to Return Date Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setReturnDateTextField() {
        return setReturnDateTextField(data.get("RETURN_DATE"));
    }

    /**
     * Set value to Return Date Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setReturnDateTextField(String returnDateValue) {
        returnDate.sendKeys(returnDateValue);
        return this;
    }

    /**
     * Set default value to Sms Sent With Download Link Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setSmsSentWithDownloadLink1TextField() {
        return setSmsSentWithDownloadLink1TextField(data.get("SMS_SENT_WITH_DOWNLOAD_LINK_1"));
    }

    /**
     * Set value to Sms Sent With Download Link Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setSmsSentWithDownloadLink1TextField(String smsSentWithDownloadLink1Value) {
        new Select(smsSentWithDownloadLink1).selectByVisibleText(smsSentWithDownloadLink1Value);
        return this;
    }

    /**
     * Set default value to Sms Sent With Download Link Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setSmsSentWithDownloadLink2TextField() {
        return setSmsSentWithDownloadLink2TextField(data.get("SMS_SENT_WITH_DOWNLOAD_LINK_2"));
    }

    /**
     * Set value to Sms Sent With Download Link Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setSmsSentWithDownloadLink2TextField(String smsSentWithDownloadLink2Value) {
        smsSentWithDownloadLink2.sendKeys(smsSentWithDownloadLink2Value);
        return this;
    }

    /**
     * Set default value to To Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setToTextField() {
        return setToTextField(data.get("TO"));
    }

    /**
     * Set value to To Text field.
     *
     * @return the RedBus class instance.
     */
    public RedBus setToTextField(String toValue) {
        to.sendKeys(toValue);
        driver.findElement(By.xpath("//*[@id='search']//ul//li[text()='"+toValue+"']")).click();
        
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the RedBus class instance.
     */
    public RedBus submit() {
        clickSearchBusesButton();
        return this;
    }

    /**
     * Unset default value from Sms Sent With Download Link Drop Down List field.
     *
     * @return the RedBus class instance.
     */
    public RedBus unsetSmsSentWithDownloadLinkDropDownListField() {
        return unsetSmsSentWithDownloadLinkDropDownListField(data.get("SMS_SENT_WITH_DOWNLOAD_LINK"));
    }

    /**
     * Unset value from Sms Sent With Download Link Drop Down List field.
     *
     * @return the RedBus class instance.
     */
    public RedBus unsetSmsSentWithDownloadLinkDropDownListField(String smsSentWithDownloadLinkValue) {
        WebElement smsSentWithDownloadLink = null;
		new Select(smsSentWithDownloadLink).deselectByVisibleText(smsSentWithDownloadLinkValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the RedBus class instance.
     */
    public RedBus verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the RedBus class instance.
     */
    public RedBus verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
