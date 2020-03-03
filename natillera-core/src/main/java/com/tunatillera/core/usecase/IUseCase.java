package com.tunatillera.core.usecase;

public interface IUseCase<Input, Output> {
	Output execute(Input input);
}
