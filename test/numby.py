def extract_numbers_divisible_by_3_and_5(input_tuple):
    result = [num for num in input_tuple if num % 3 == 0 and num % 5 == 0]
    return result

input_tuple = (15, 9, 10, 30, 7, 210, 45, 10, 60, 18, 43)

result = extract_numbers_divisible_by_3_and_5(input_tuple)
print("Numbers divisible by both 3 and 5:", result)
