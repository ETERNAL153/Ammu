from collections import Counter
import re

def word_frequency(paragraph):
    cleaned_paragraph = re.sub(r'\W', ' ', paragraph.lower())
    # print(cleaned_paragraph)
    words = cleaned_paragraph.split()
    # print(words)
    word_counts = Counter(words)

    return word_counts
# paragraph = "The quick brown fox jumps over the lazy dog. A bright, blue sky stretches above, and fluffy clouds float lazily by. In the enchanted forest, ancient trees whisper secrets to the curious creatures that call it home. As the sun sets, painting the horizon with hues of orange and pink, a gentle breeze rustles the leaves, creating a symphony of nature's melodies. On the bustling city streets, people hurry along, immersed in their daily routines. Neon lights flicker, and the distant hum of traffic fills the air. In the serene countryside, rolling hills stretch into the distance, adorned with wildflowers and grazing sheep. Each day unfolds like a new chapter, weaving stories of life's adventures."
paragraph = input("paragraph:")

frequency_result = word_frequency(paragraph)
print("Word Frequency:")
for word, count in frequency_result.items():
    print(f"{word}: {count}")
