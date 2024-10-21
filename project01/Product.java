import java.util.Date;

public class Product{
    private Long id;
    private String prodName;
    private String prodDesc;
    private String prodCat;
    private Date createdDate;
    private Float price;

    public Product(Long id, String prodName, String prodDesc, String prodCat, Date createdDate, Float price) {
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCat = prodCat;
        this.createdDate = createdDate;
        this.price = price;
    }
    
    public Product(String prodName, String prodDesc, String prodCat, Float price) {
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCat = prodCat;
        this.price = price;
    }



    

    public Product() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdCat() {
        return prodCat;
    }

    public void setProdCat(String prodCat) {
        this.prodCat = prodCat;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Float getPrice() {
        return price;
    }


    public void setPrice(Float price) {
        this.price = price;
    }

    public String toString(){
        return id + " " + prodName + " "+ prodDesc + " " + prodCat + " " + createdDate;
    }


    
    
}