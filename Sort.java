public class Sort {

  /**
   * @param a
   */
  public static void sort(int[] a) {

    for(int i=0; i < a.length; ++i){
      int value = a[i];
      int j;
      for(j=i-1; j>=0; --j){
        if (a[j] > value){
          a[j+1] = a[j];
        } else {
          break;
        }
        a[j+1] = value;
      }
    }
  }
}