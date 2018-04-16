# import numpy as np
import cv2
# import matplotlib.pyplot as plt

source = input("Enter the source image path including extension\n")
img = cv2.imread(source,cv2.IMREAD_UNCHANGED) # Reading the image

font = cv2.FONT_HERSHEY_SIMPLEX
x = input("Enter x\n")
y = input("Enter y\n")
pos = (int(x),int(y))
fontScale              = 1
fontColor              = (255,255,255)
lineType               = 2

text = input("Enter the text\n")
cv2.putText(img,text, 
    pos, 
    font, 
    fontScale,
    fontColor,
    lineType)

#Display the image
print("Press ESC key to exit")
cv2.imshow("image",img)
k = cv2.waitKey(0)
if k == 27:         # wait for ESC key to exit
    cv2.destroyAllWindows()
# Saving the image    
destination = input("Enter destination path with name and extension of the file\n")
cv2.imwrite(destination,img)
print("Image Processed")
cv2.destroyAllWindows()

