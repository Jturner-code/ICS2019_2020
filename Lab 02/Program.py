import sklearn
from sklearn.utils import shuffle
from sklearn.neural_network import MLPClassifier
from sklearn.model_selection import cross_validate
import pandas 
import matplotlib.pyplot as plt
import seaborn as sns # visualization
import numpy as np
data=pandas.read_csv("Missile.data",header=None)
print(data)

sns.pairplot(data=data,vars=(0,1,2), hue=3)
plt.show()
data=np.array(data)
X=data[:,0:3] #This gets all the rows and only the first 4 columns.
Y=data[:,3]
print(X.shape) #(150,4)
print(Y.shape) #(150,)
trainX=X[:65]
trainY=Y[:65]
testX=X[65:]
testY=Y[65:]
clf = MLPClassifier(hidden_layer_sizes=[2], random_state=1, max_iter = 1000)
clf.fit(trainX, trainY)
print(clf.coefs_)
prediction=clf.predict(testX)
print(prediction)
# The numbers are how accurate the computer was with its guesses
print(clf.score(trainX,trainY))
print(clf.score(testX,testY))
cv_results = cross_validate(clf, X, Y, cv=4)
print(cv_results)

