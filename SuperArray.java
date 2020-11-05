public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int InitialCapacity){
    size = 0;
    data = new String[InitialCapacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if ((element != null) && (size >= data.length)){
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
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize(){
    String[] newArray = new String[data.length*2];
    for (int i=0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public boolean isEmpty(){
    return (size==0);
  }

  public String toString(){
    if (size==0) {
      return "[]";
    }
    String string = "" + data[0];
    for (int i=1; i<size; i++){
      string += ", " + data[i];
    }
    return (String) ("[" + string + "]");
  }

  public boolean contains(String s){
    boolean isthereS = false;
    for (int i=0; i<size; i++){
      if (data[i].equals(s)){
        isthereS = true;
      }
    }
    return isthereS;
  }

  public void clear(){
    for (int i=0; i<size; i++){
      data[i] = null;
    }
    size = 0;
  }

  public void add(int index, String element){
    if (size>=data.length){
      resize();
    }
    String temp = "";
    String temp2 = element;
    size ++;
    for (int i=index; i<size; i++){
      temp = data[i];
      data[i] = temp2;
      temp2 = temp;
    }
  }

  public String remove(int index){
    String string = data[index];
    size = size-1;
    for (int i=index; i<size; i++){
      data[i] = data[i+1];
    }
    data[size] = null;
    return string;
  }

  public int indexOf(String s){
    for (int i=0; i<size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] array = new String[size];
    for (int i=0; i<size; i++){
      array[i] = data[i];
    }
    return array;
  }
}
