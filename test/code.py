class Animal:
    def __init__(self, name, age, sound='No sound available'):
        self.name = name
        self.age = age
        self.sound = sound

    def make_sound(self):
        print(self.sound)

    def __str__(self):
        return f"{self.name} ({self.age} years old)"


class Mammal(Animal):
    def __init__(self, name, age, color, sound='No sound available'):
        super().__init__(name, age, sound)
        self.color = color

    def make_sound(self):
        print(f"{self.name} the mammal in color {self.color} makes {self.sound}")


class Bird(Animal):
    def __init__(self, name, age, flight_speed, sound='No sound available'):
        super().__init__(name, age, sound)
        self.flight_speed = flight_speed

    def make_sound(self):
        print(f"{self.name} the bird with Flight Speed: {self.flight_speed} mph makes {self.sound}")


def perform_sound_concert(animals):
    for animal in animals:
        animal.make_sound()


# Example usage:
lion = Mammal("Lion", 5, "Golden", "Roar")
eagle = Bird("Eagle", 3, 50, "Screech")
rabbit = Mammal("rabbit", 2, "White")

animals_list = [lion, eagle, rabbit]

# Perform sound concert using polymorphism
perform_sound_concert(animals_list)
