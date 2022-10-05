package study;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    
    @Test
    void split1() {
    	String[] actual = "1,2".split(",");
    	assertThat(actual).contains("1", "2");
    }
    
    @Test
    void split2() {
    	String[] actual = "1".split(",");
    	assertThat(actual).containsExactly("1");
    }
    
    @Test
    void substring() {
    	String actual = "(1,2)";
    	String subString = actual.substring(1, actual.length() - 1);
    	
    	assertThat(subString).isEqualTo("1,2");
    }
    
    @Test
    @DisplayName("charAt() 메서드 범위 값을 벗어나면 StringIndexOutOfBoundsException이 발생한다")
    void charAt() {
    	String abc = "abc";
    	assertThrows(StringIndexOutOfBoundsException.class, () -> abc.charAt(abc.length()));
    }
}
