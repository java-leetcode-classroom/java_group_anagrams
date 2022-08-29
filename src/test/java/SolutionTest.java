import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void groupAnagramsExample1() {
    assertEquals(List.of(
        List.of("tan", "nat"),
        List.of("bat"),
        List.of("eat", "tea", "ate")
        ), sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
  }
  @Test
  void groupAnagramsExample2() {
    assertEquals(List.of(
        List.of("")
    ), sol.groupAnagrams(new String[]{""}));
  }
  @Test
  void groupAnagramsExample3() {
    assertEquals(List.of(
        List.of("a")
    ), sol.groupAnagrams(new String[]{"a"}));
  }
}