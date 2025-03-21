package javaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		int[] nummbers = { 4, 5, 2, 7, 5, 3, 9, 1 };

		// List<Integer> numberList=
		List<Integer> sortedList = Arrays.stream(nummbers).boxed().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

		String[] names = { "Abdul", "Arbaz", "Rihana", "Hameed" };

		List<String> namesAsList = Arrays.asList(names);

		List<String> filterName = namesAsList.stream().filter(s -> s.contains("Hameed") || s.contains("Abdul"))
				.collect(Collectors.toList());
		System.out.println(filterName);

		List<String> sortedNameList = namesAsList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNameList);

	}

}
