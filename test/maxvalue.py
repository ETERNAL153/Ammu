find_max_value_key = lambda input_dict: max(input_dict, key=input_dict.get) if input_dict else None

my_dict = {'a': 10, 'b': 20, 'c': 30}

result = find_max_value_key(my_dict)

if result is not None:
    print(f"The key with the maximum value is: {result}")
else:
    print("The dictionary is empty.")
