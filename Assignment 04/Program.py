import math
import turtle

def fahrenheitToCelcius(f):
	c=(f-32)*(5/9)
	print(str(f)+ " degrees Fahrenheit is "+str(c) +" degrees Celsius")
	

f=float (input ("what is the temperate in fahrenheit:"))
fahrenheitToCelcius(f)

def acresToBarns(a):
	b= a* 4.047e+31
	print(str(a)+ "acres is approxmently "+str(b) +" barns")
	

a=float (input ("How many acres are there:"))
acresToBarns(a)



n= float(input ("Input a number of sides:"))
bob=turtle.Turtle()

def drawPolygon(n):
	a = (n - 2)*180
	a=a/n
	a=180-a
	
	while n > 0:
		bob.forward(50)
		bob.left(a)
		bob.forward(50)
		n=n-1
drawPolygon(n)

screen=turtle.getscreen()
screen.mainloop()

