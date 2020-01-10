package pl.itacademy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void solutionShouldReturnSecondMaxNumber() {
        assertThat(solution.secondMaxNumber(List.of(5, 3, 2, 9, 1, 4, 15)), equalTo(9));
    }

    @Test
    public void solutionShouldReturnPalindromes() {
        assertThat(solution.findPalindromes(List.of("flight", "car", "civic", "radar", "level", "day", "round", "rotor", "kayak")),
                containsInAnyOrder("civic", "radar", "level", "rotor", "kayak"));
    }
}