package sopvn.demo.model;

public class Product {
	private int id_pro;
	private String name_pro;
	private double price_pro;
	private String descript_pro;
	private String img_name;
	private int idc;
	
	public static String ID_PRO = "id_pro";
	public static String NAME_PRO = "name_pro";
	public static String PRICE_PRO = "price_pro";
	public static String DESCRIPT_PRO = "descript_pro";
	public static String IMG_NAME = "img_name";
	public static String IDC = "idc";
	
	public Product(int id_pro, String name_pro, double price_pro, String descript_pro, String img_name, int idc) {
		super();
		this.id_pro = id_pro;
		this.name_pro = name_pro;
		this.price_pro = price_pro;
		this.descript_pro = descript_pro;
		this.img_name = img_name;
		this.idc = idc;
	}
	
	
	public Product() {
		super();
		this.id_pro = 0;
		this.name_pro = "";
		this.price_pro = 0;
		this.descript_pro = "";
		this.img_name = "";
		this.idc = 0;
	}
	
	public int getId_pro() {
		 return id_pro;
	 }
	 
	 public void setId_pro(int id_pro) {
		 this.id_pro = id_pro;
	 }
	 
	 public String getName_pro() {
		 return name_pro;
	 }
	 
	 public void setName_pro(String name_pro) {
		 this.name_pro = name_pro;
	 }
	 
	 public double getPrice_pro() {
		 return price_pro;
	 }
	 
	 public void setPrice_pro(double price_pro) {
		 this.price_pro = price_pro;
	 }
	 
	 public String getDescript_pro() {
		 return descript_pro;
	 }
	 
	 public void setDescripts_pro(String descript_pro) {
		 this.descript_pro = descript_pro;
	 }
	 
	 public String getImg_name() {
		 return img_name;
	 }
	 
	 public void seImge_name(String img_name) {
		 this.img_name = img_name;
	 }
	 
	 public int getIdc() {
		 return idc;
	 }
	 
	 public void setIdc(int idc) {
		 this.idc = idc;
	 }
}
