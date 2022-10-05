package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
	}

	@Test
	@DisplayName("numbers의 사이즈를 확인한다")
	void size() {
		assertThat(numbers.size()).isEqualTo(3);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	@DisplayName("numbers에 valueSource값들이 포함되어있는지 확인한다")
	void contains(int number) {
		assertThat(numbers.contains(number));
	}

	@ParameterizedTest
	@CsvSource({ "1, true", "2, true", "3, true", "4, false", "5, false" })
	@DisplayName("numbers에 CsvSource를 사용하여 포함되지 않은 값들도 테스트를 통과하도록 한다")
	void containsCsvSource(int input, boolean expected) {
		assertThat(numbers.contains(input)).isEqualTo(expected);
	}
}
