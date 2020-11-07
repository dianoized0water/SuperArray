public class Demo{
  public static void removeDuplicates(SuperArray s){
    String[] array = s.toArray();
    for (int i=0; i<s.size(); i++){
      if (i != s.indexOf(array[i])){
        s.remove(i);
        array = s.toArray();
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray();
    String[] c = a.toArray();
    for (int i=0; i<a.size(); i++){
      if (b.contains(c[i])){
        overlap.add(c[i]);
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    int x = Math.min(a.size(), b.size());
    String[] c = a.toArray();
    String[] d = b.toArray();
    SuperArray zipped = new SuperArray();
    for (int i=0; i<x; i++){
      zipped.add(c[i]);
      zipped.add(d[i]);
    }
    if (a.size()>x){
      for (int i=x; i<a.size(); i++){
        zipped.add(c[i]);
      }
    }
    else {
      for (int i=x; i<b.size(); i++){
        zipped.add(d[i]);
      }
    }
    return zipped; 
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
  }
}
