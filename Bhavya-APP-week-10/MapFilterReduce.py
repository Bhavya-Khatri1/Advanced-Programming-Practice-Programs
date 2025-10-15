from functools import reduce

# Sample list
numbers = [1, 2, 3, 4, 5, -6, -2, 8]

# (a) Square all even numbers
even_numbers = filter(lambda x: x % 2 == 0, numbers)  # keep only even numbers
squared_evens = map(lambda x: x**2, even_numbers)      # square them
print("Squared even numbers:", list(squared_evens))

# (b) Filter out negative numbers and find sum of remaining
positive_numbers = filter(lambda x: x >= 0, numbers)   # keep only non-negative
sum_positive = reduce(lambda x, y: x + y, positive_numbers)  # sum them
print("Sum of non-negative numbers:", sum_positive)