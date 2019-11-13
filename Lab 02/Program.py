import sklearn
from sklearn.utils import shuffle
from sklearn.neural_network import MLPClassifier
from sklearn.model_selection import cross_validate
import pandas 
import matplotlib.pyplot as plt
import seaborn as sns # visualization
import numpy as np
#You can add that header equals none s it assumes theere is no header and assigns a number as a header.
data=pandas.read_csv("iris.data",header=None)
print(data)
#Yes because although some overlap we can distinguish flowers if we use every diffrent part of the flower.
#iris setosa.
#iris versicolor and iris virginica and because they overlap.
sns.pairplot(data=data,vars=(0,1,2,3), hue=4)
plt.show()
data=np.array(data)
X=data[:,0:4] #This gets all the rows and only the first 4 columns.
Y=data[:,4]
print(X.shape) #(150,4)
print(Y.shape) #(150,)
#I printed x and y to see how it was shuffled after the random state
#Random_state is how things are randomized and it can be assigned an int, istance, or none and behaves diffrently by what it is assigned.
#It randomizes an array so the computer won't just have all of one type group together when its training.
X,Y=shuffle(X,Y,random_state=0)
trainX=X[:100]
trainY=Y[:100]
testX=X[100:]
testY=Y[100:]
clf = MLPClassifier(hidden_layer_sizes=[3,3], random_state=1, max_iter = 2000)
clf.fit(trainX, trainY)
print(clf.coefs_)
prediction=clf.predict(testX)
print(prediction)
# The numbers are how accurate the computer was with its guesses
print(clf.score(trainX,trainY))
print(clf.score(testX,testY))
cv_results = cross_validate(clf, X, Y, cv=4)
print(cv_results)

