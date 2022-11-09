package fy.ds;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import org.apache.commons.collections4.MapUtils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSInput;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

class MapTest {
    Map<String, List<Integer>> map = new HashMap<>();

    @Test
    void test () {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.put("a", 1);
        multimap.put("a", 2);
        System.out.println(multimap);
        ListMultimap<Integer, String> revMap = Multimaps.invertFrom(multimap, ArrayListMultimap.create());
        System.out.println(revMap);
    }
}