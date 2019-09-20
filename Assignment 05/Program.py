import random

def hilo(guess, answer):
	
	if(guess < number):
		print("Your guess is too low, try again")
		guess = int(input("Guess again: "))
	elif(guess > number):
		print("Your guess is too high, please try again.")
		guess = int(input("Guess again: "))
	else:
		print("You are correct the number is "+ str(guess))
		return
	
	hilo(guess, number)



number = random.randint(1,100)
guess = int(input("Guess the number, enter a number betweewn 1 and 100:"))
hilo(guess, number)


