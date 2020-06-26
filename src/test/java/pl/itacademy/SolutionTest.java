package pl.itacademy;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void solutionShouldReturnSecondMaxNumber() {
        assertThat(solution.secondMaxNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11))).isEqualTo(10);
        assertThat(solution.secondMaxNumber(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1))).isEqualTo(9);
        assertThat(solution.secondMaxNumber(List.of(-10, -9, -8, -7, -6, -5, -4))).isEqualTo(-5);
        assertThat(solution.secondMaxNumber(List.of(-3, -4, -5, -6, -7, -8, -9, -10))).isEqualTo(-4);
        assertThat(solution.secondMaxNumber(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7))).isEqualTo(6);
        assertThat(solution.secondMaxNumber(List.of(12, 12, 11, 11, 10, 10, 9, 9, 8, 8, 7, 7, 6, 6, 5, 5))).isEqualTo(11);
        assertThat(solution.secondMaxNumber(List.of(1, 10, 2, 9, 3, 8, 4, 7, 5, 6))).isEqualTo(9);
    }

    @Test
    public void solutionShouldReturnPalindromes() {
        assertThat(solution.findPalindromes(List.of("flight", "car", "civic", "radar", "level", "day", "round", "rotor", "kayak")))
                .containsExactlyInAnyOrder("civic", "radar", "level", "rotor", "kayak");
    }
}