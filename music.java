import java.util.Scanner;
public class music {
  private String name;
  private String artist;
  private String rel_date;
  private String available;
  public music(){
    name = "Unknown";
    artist = "Unknown";
    rel_date = "Unknown";
    available = "Unknown";
  }
  public music(String inname, String inartist, String inrel_date,String inavailable){
    name=inname;
    artist=inartist;
    rel_date=inrel_date;
    available=inavailable;
  }
  public String getName(){
    return name;
  }
  public String getArtist(){
    return artist;
  }
  public String getRel_date(){
    return rel_date;
  }
  public String musicAction(){
    return available;
  }
  public void setArtist(String newartist){
    artist=newartist;
  }
  public void setDate(String newrel_date){
    rel_date=newrel_date;
  }
  public void setName(String newname){
    name=newname;
  }
  public void setAvailable(String newavailable){
    available=newavailable;
  }
  
}
