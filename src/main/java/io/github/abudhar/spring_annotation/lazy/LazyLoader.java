package io.github.abudhar.spring_annotation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoader {
	public LazyLoader() {
		System.out.println("Lay loader...........");
	}
}
