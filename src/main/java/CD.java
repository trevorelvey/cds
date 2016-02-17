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

  public static CD findID(int id) {
    try {
      return cdList.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
  cdList.clear();
  }
}
