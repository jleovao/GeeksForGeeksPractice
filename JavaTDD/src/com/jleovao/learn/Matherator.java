package com.jleovao.learn;

public class Matherator implements Adder, Subtractor, Multiplier, Divider {

	@Override
	public long subtract(long... operands) {
		long ret = operands[0];
		for(int operandIndex = 1; operandIndex < operands.length; operandIndex++) {
			ret -= operands[operandIndex];
		}
		return ret;
	}

	@Override
	public long add(long... operands) {
		long ret = 0;
		for(long operand : operands) {
			ret += operand;
		}
		return ret;
	}
	
	@Override
	public long multiply(long... operands) {
		long ret = operands[0];
		for (int operandIndex = 1; operandIndex < operands.length; operandIndex++) {
			ret *= operands[operandIndex];
		}
		return ret;
	}

	@Override
	public long divide(long... operands) {
		long ret = operands[0];
		for (int operandIndex = 1; operandIndex < operands.length; operandIndex++) {
			ret /= operands[operandIndex];
		}
		return ret;
	}
	
	
	

}
