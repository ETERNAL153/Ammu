def find_second_occurrence_index(input_tuple, element):
    try:
        first_occurrence_index = input_tuple.index(element) 
        second_occurrence_index = input_tuple.index(element, first_occurrence_index + 1)

        return second_occurrence_index
    except ValueError:
        return -1

input_tuple = (1, 2, 3, 2, 4, 5, 2, 6, 3)

element_to_find = 3
result = find_second_occurrence_index(input_tuple, element_to_find)

if result != -1:
    print(f"The index of the second occurrence of {element_to_find} is: {result}")
else:
    print(f"{element_to_find} not found or does not have a second occurrence.")
