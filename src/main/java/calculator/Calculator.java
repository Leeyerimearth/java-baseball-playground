package calculator;

import java.util.Arrays;
import java.util.Stack;

public class Calculator {
	Stack<Integer> numberStack = new Stack<Integer>();
	
	public int calculate(String input) {
		String[] values = input.split(" ");
		
		for(String value: values) {
			//숫자면 스택에 넣고
			if(isNumber(value)) {
				//비어있지 않으면 에러
				numberStack.add(Integer.parseInt(value));
				continue;
			}
			boolean isCollectSign = Arrays.stream(Sign.values()).anyMatch(v -> v.getCalculateSign().equals(value));
			//문자면 enum에 있는지 확인 후
			//스택 첫번재 값을 pop해서 계산한다.
		}
		return 0;
	}
	
	private boolean isNumber(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
