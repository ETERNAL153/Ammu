from collections import defaultdict

def letter_frequency(input_string):
    # Using defaultdict to handle missing keys (letters) without raising KeyError
    letter_counts = defaultdict(int)

    # Counting the frequency of each letter
    for letter in input_string:
        if letter.isalpha():
            letter_counts[letter.lower()] += 1

    return letter_counts

# Example usage:
input_string = "Ram Sai kumar"

frequency_result = letter_frequency(input_string)
print("Letter Frequency:")
for letter, count in frequency_result.items():
    print(f"{letter}: {count}")
