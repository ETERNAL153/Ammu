average_key_value = lambda input_dict: sum(input_dict.keys()) / len(input_dict) if input_dict else None

my_dict = {1: 10, 2: 20, 3: 30, 4:44}

result = average_key_value(my_dict)

if result is not None:
    print(f"The average value of the keys is: {result}")
else:
    print("The dictionary is empty.")
