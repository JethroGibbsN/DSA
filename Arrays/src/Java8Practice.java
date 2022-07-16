import java.util.*;
import java.util.stream.Collectors;
//Java 8 Practice
import static java.util.stream.Collectors.*;

public class Java8Practice {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .mapToInt(i -> i). sum();
        Long sum123 = integers.stream()
                .mapToInt(Integer::intValue).summaryStatistics().getSum();
        System.out.println(sum);
        Long result = integers.stream()
                .collect(counting());
        System.out.println(result);
        Map< Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        Integer max = map.entrySet().stream().collect(maxBy((o1, o2) -> o2.getValue().compareTo(o1.getValue()))).get().getValue();
        Integer max3 = map.entrySet().stream().max((o1, o2) -> o2.getValue().compareTo(o1.getValue())).get().getValue();
        Integer max2 = map.values().stream().collect(maxBy(Integer::compareTo)).get();
        System.out.println(max3);
        List<Integer> l = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Map<Integer, Integer> ssMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));
        Map<Integer, Integer> sMap = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));
        System.out.println(ssMap);
        System.out.println(sMap);

                List<Integer> num = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics a = num.stream()
                .collect(summarizingInt(Integer::intValue));
        System.out.println(a);
//        List<String> numS = Arrays.asList("a","A", "B","cc");
////        Double aa = (num.stream().map(i -> i + "").collect(Collectors.summingDouble(String::length)));
////        System.out.println(aa);
//        Optional<Integer> result = num.stream()
//                .collect(Collectors.maxBy(Integer::compareTo));
////        System.out.println(result.get());
//        Optional<Integer> op = Optional.ofNullable(null);
//        Map<Integer, Set<String>> gb = numS.stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
//        System.out.println(op.get());
    }
}  