import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> cdList = new ArrayList<CD>();

  private String mTitle;
  private int mID;

  public CD(String title){
    mTitle = title;
    cdList.add(this);
    mID = cdList.size();
  }

  public String getTitle(){
    return mTitle;
  }

  public static ArrayList<CD> all() {
    return cdList;
  }

  public int getID() {
    return mID;
  }

}
