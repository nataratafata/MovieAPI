package firstproject2.mcs.com.flower_mvp.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlowerModel {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("Title")
    @Expose
    private String title;//category
    @SerializedName("Year")
    @Expose
    private Double year;//price
    @SerializedName("Genre")
    @Expose
    private String genre;//instruction
    @SerializedName("Poster")
    @Expose
    private String poster;//photo
   // @SerializedName("name")
   //@Expose
  //  private String name;

////title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
/////year
    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }
//genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
///poster
    public String getPoster() {
        return poster;
    }

    public void setPoster(String photo) {
        this.poster = poster;
    }

   // public String getName() {
   //     return name;
   // }

  //  public void setName(String name) {
   //     this.name = name;
   // }
/////ID
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

}

