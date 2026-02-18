package GenericMergeArrays;

import java.lang.reflect.Array;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if(a== null && b== null){
            return null;
        }else if(a == null ){
            return b;
        }
        else if(b== null){
            return a;
        }
        T[] merge = (T[]) Array.newInstance(a.getClass().componentType(), a.length+ b.length);

        for(int i=0; i< a.length; i++){
            merge[i]=a[i];
        }
        for(int i=0; i< b.length; i++){
            merge[a.length +i]= b[i];
        }


        return merge;

    }
}
