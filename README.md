# Number  Array 
    int[] numbers = { 1, 4, 7, 9, 23, 46, 57, 89, 34, 56, 78, 1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 46, 45, 45, 65, 76, 87,
				98, 12 };

		System.out.println("Number : " + numbers);
# Sorted Number :
    List<Integer> sortedArray = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

		System.out.println("Sorted Number : " + sortedArray);
# Reverse Sorted Number : 
    List<Integer> reverseSortedArray = Arrays.stream(numbers).boxed().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("Reverse Sorted Number : " + reverseSortedArray);
# Second Higest Number :
    
    Integer secondHigestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().orElse(0);

		System.out.println("Second Higest Number : " + secondHigestNumber);

# Number and there count :
      
      Map<Integer, Long> intCount = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("number and there count  : " + intCount);

# Duplicate number :
    
    List<Integer> duplicateNUmber = intCount.entrySet().stream().filter(k -> k.getValue() > 1).map(v -> v.getKey())
				.collect(Collectors.toList());

		System.out.println("Duplicate number : " + duplicateNUmber);

# Non repeated NUmber :
    List<Integer> nonRepeatedNumber = intCount.entrySet().stream().filter(k -> k.getValue() <= 1)
				.map(v -> v.getKey()).collect(Collectors.toList());

		System.out.println("Non repeated NUmber : " + nonRepeatedNumber);

# Reduce with binary operator only :

    BinaryOperator<Integer> maxFunction = (num1, num2) -> num1 > num2 ? num1 : num2;

		Optional<Integer> maxBinary = Arrays.stream(numbers).boxed().reduce(maxFunction);

		System.out.println("Max number by binary : " + maxBinary);

# Reduce with indentifier and accumulator
	Arrays.stream(numbers).boxed().reduce(Integer.MAX_VALUE, maxFunction);

# Use reduce with three parameters for parallel reduction
	Integer sum = Arrays.stream(numbers).boxed().reduce(0, // identity
				(acc, n) -> acc + n
		// , // accumulator
		// (partialResult1, partialResult2) -> partialResult1 + partialResult2 //
		// combiner
		);

# Print the sum
	System.out.println("Sum of numbers: " + sum);

		// Use reduce to find the sum of integers
		int maxNum = Arrays.stream(numbers).boxed().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println("Max NUmber : " + maxNum);

# Get the second higher number form the array of numer
	int secundMax = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
		System.out.println(secundMax);

# Get the second min number form the array of int
	int secundMin = Arrays.stream(numbers).boxed().sorted().skip(1).findAny().get();
		System.out.println(secundMin);

# Using the maX method of stream
	Optional<Integer> findFirst = Arrays.stream(numbers).boxed().sorted(Integer::compareTo).findFirst();

	Optional<Integer> max = Arrays.stream(numbers).boxed().max(Integer::compareTo);

	Optional<Integer> min = Arrays.stream(numbers).boxed().max(Comparator.reverseOrder());

	Arrays.stream(numbers).boxed().reduce(Integer::max).get();

	Arrays.stream(numbers)// stream of int
				.boxed() // converting to integer
				.reduce(Integer.MIN_VALUE, (a, b) -> Integer.min(a, b));
