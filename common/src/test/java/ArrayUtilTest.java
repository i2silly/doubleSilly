import com.rookie.common.constant.ArrayFilter;
import com.rookie.common.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtilTest {
    @Test
    public void unWarpTest() {
        Integer[] arr = {1, 2, 3, 4};
        int[] iArr = ArrayUtil.unWarp(arr);
        System.out.println(iArr.getClass().getComponentType().getName());
    }

    @Test
    public void toStringArrTest() {
        String[] arr = ArrayUtil.toStringArr((int) 1, null, "abc", 'c');
        System.out.println(Arrays.asList(arr).toString());
    }

    @Test
    public void toStringTest() {
        Map<String,String> map = new HashMap<>();
        map.put("1","3");
        Object[] obj = {1, "2", null, map};
        Integer[] i = {1, 2, 4};
        System.out.println(ArrayUtil.toString(obj));
    }

    @Test
    public void joinTest() {
        Object[] i = {" ", null, 5};
        System.out.println(ArrayUtil.join(i, ",", false, false, ArrayFilter.ALL));
    }
}
