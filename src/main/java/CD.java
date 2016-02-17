import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> cdList = new ArrayList<CD>();

  private String mTitle;

  public CD(String title){
    mTitle = title;
  }

  public String getTitle(){
    return mTitle;
  }

}
