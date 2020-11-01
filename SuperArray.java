public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if ((data != null) && (size >= data.length)){
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }

  public String get(int index){
      return data[index];
  }

  public String set(int index, String element){
    data[index] = element;
    return data[index];
  }

  private void resize(){
    String[] newArray = new String[data.length*2];
    for (int i=0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }
}
