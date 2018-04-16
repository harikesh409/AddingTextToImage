import cv2

# Reading the image
source = input("Enter the source image path including extension\n")
img = cv2.imread(source,cv2.IMREAD_UNCHANGED) 
x = input("Enter x\n")
y = input("Enter y\n")
font = cv2.FONT_HERSHEY_SIMPLEX
pos = (int(x),int(y))
fontScale = 1
fontColor = (255,255,255)
lineType = 2

# Reading the text and writing it to the image
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
k = cv2.waitKey(0) #  wait for infinite time
if k == 27:         # wait for ESC key to exit
    cv2.destroyAllWindows() # close all the opened windows
    
# Saving the image    
destination = input("Enter destination path with name and extension of the file\n")
cv2.imwrite(destination,img)
print("Image Processed")
cv2.destroyAllWindows()

