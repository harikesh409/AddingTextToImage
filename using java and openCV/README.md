# Adding Text To Image using openCV and Java

To use the code download the source code and openCV library.

[Download openCV](https://opencv.org/releases.html "openCV")

Use [Eclipse](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/keplersr1 "Eclipse") as the IDE.

## Configuring openCV

1. After opening eclipse goto **Window** option in the menu bar and select  **Preferences**.<br/>
![alt text](https://docs.opencv.org/2.4/_images/1-window-preferences.png "Window-Preferences")<br/>
2. Navigate under Java –> Build Path –> User Libraries and click New....<br/>
![alt text](https://docs.opencv.org/2.4/_images/2-user-library-new.png "2-user-library-new.png")<br/>
3. Enter a name, e.g. *OpenCV*, for your new library.<br/>
4. Now select your new user library and click Add External JARs....
5. Select the jar file present in the openCV folder (installedDir\build\java) and select **opencv-246.jar**.
6. After adding the jar, extend the opencv-246.jar and select Native library location and press Edit....<br/>
![alt text](https://docs.opencv.org/2.4/_images/5-native-library.png "native-library")<br/>
7. Select External Folder... and browse to select the folder **installedDir\build\java\x64**.
![alt text](https://docs.opencv.org/2.4/_images/6-external-folder.png "external-folder")<br/>
If you have a 32-bit system you need to select the x86 folder instead of x64.<br/>
8. Your user library configuration should look like this:<br/>
![alt text](https://docs.opencv.org/2.4/_images/7-user-library-final.png "final")

## Compilation

1. Create a new project and add the source code file in your project.
2. Compile the code by clicking the run from the menu.

## Inputs
1. Enter the source image path including the name and extension.<br/>
For example your image file is in E drive then you have to enter E:/car.jpg
2. Enter the text that you want to add.
3. Enter the **x** and **y** coordinates where you want to add your text on the image.
4. Enter the destination path where you want to save your processed file including the name and extension.

## Output
The processed file will be outputed at the specifed location with the specified name.

