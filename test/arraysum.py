def elementwise_sum(array1, array2):
    if len(array1) != len(array2):
        return "Arrays must have the same length for element-wise addition."
    
    result = [a + b for a, b in zip(array1, array2)]
    return result

# Example usage:
array1 = [1, 2, 3, 4]
array2 = [5, 6, 7, 8, 9]

result = elementwise_sum(array1, array2)
print("Element-wise Sum:", result)
