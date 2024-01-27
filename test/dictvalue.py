value_exists_in_dict = lambda input_dict, value: value in input_dict.values()

# Example usage:
my_dict = {'a': 10, 'b': 20, 'c': 23, 'd':40}

value_to_check = 23
result = value_exists_in_dict(my_dict, value_to_check)

if result:
    print(f"The value {value_to_check} exists in the dictionary.")
else:
    print(f"The value {value_to_check} does not exist in the dictionary.")