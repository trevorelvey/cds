import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> cdList = new ArrayList<CD>();

  private String mTitle;

  public CD(String title){
    mTitle = title;
    cdList.add(this);
  }

  public String getTitle(){
    return mTitle;
  }

  public static ArrayList<CD> all() {
    return cdList;
  }

}
