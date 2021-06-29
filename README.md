<p align=center>
<img src ="https://user-images.githubusercontent.com/60183278/121347432-d09f6c00-c944-11eb-8d51-6b46f1cd1b82.png" align="center" width="500">
<br><br>
<a target="_blank" href="https://adoptopenjdk.net/" title="Java version"><img src="https://img.shields.io/badge/Java-%3E%3D1.8-red"></a>
<a target="_blank" href="LICENSE" title="License: MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg"></a>
<a target="_blank" title ="Version"> <img src="https://img.shields.io/badge/Version-1.2-g"></a><br>
</p>

> ###  *ClientEX, a DCC (Distributed-Chat-Client) Application built using Java :computer: :satellite:*
*CLientEX* is a program mainly built to function as a Distributed Client Connectivity Program to connect with its Server (*[Socketty](https://github.com/CodyNeeraj/Socketty-Server)*), and to communicate with each other ClientEX Hosts on the bare Internet/Networking architecture !!!

***This software is a bare Client application and a Server Program is required to connect to it so, For more info regarding that Server application refer here [Socketty](https://github.com/CodyNeeraj/Socketty-Server)***
## Navigation :
- [User Interface](#user-interface )
 - [Main Features](#main-features)
 - [Permissions](#usage-permissions)
 - [Project Requirements](#development-requirements)
 - [Dependancy](#supported-platforms-and-dependancies)
 - [License Info](#license)
 - [Downloads](#downloads)
 - [Feedback](#feedback)

 
## User Interface 
**1. Main Screen (Login Mode)**

![client_logon](https://user-images.githubusercontent.com/60183278/122186005-3642a980-ceab-11eb-965d-123eab542f66.png) <br><br>
**2. Chat Screen (Running/Connected Mode)**

![clsMutliUser](https://user-images.githubusercontent.com/60183278/122186009-36db4000-ceab-11eb-9ddc-f51a838eb64f.png)


> *Other working is in the program itself ;) !!*
## Main Features
 - Able to connect many Clients Asynchronously.
 - Easily share Images, Audio, text and other media files over it.
 - Automatic Hide/Show console written using JAVA properties.
 - A Local personal chat server for anonymous discussions.
 - Highly optimised for long term usage.
 - No need to install additional dependencies.
 - Direct deployment Workflow.
 - Rest will made public soon :blush:
## Development Requirements
- Must Ensure to have a JDK installed in your Operating System Version *(>=1.8) any Vendor* 
- Familiarity with Apache ANT build tool (can get replaced with Maven or Gradle in the future builds).
- NetBeans IDE Latest Version will also work, but I've developed this program on version 8.2 using JDK 1.8.
- For Ease of deployment , usage of Jlink and JPackage and Other Packaging Bundle Softwares.
- Nerdy Programmer Skills :computer: :mag_right:
- A lot of Coffee :coffee:
## Usage Permissions
This software is licensed under MIT License any Commercial use can't be done without asking the developer and liability to use all these sources must be in hand of developer only, you may need to ask me for using this in your project by giving credit to the native developer :stuck_out_tongue_winking_eye:!<br>Probably as per **MIT's license** everyone is free to use the software but in case of development of any software using FOSS principle the MIT gave her license to the follow developers all around the world which is an extension of Apache 2.0
 
## Supported Platforms and Dependancies
  - Windows, Mac and Linux for both x32 and x64 bit.
  - Internet Required if you want to connect outside your Network.
  - Specified port must be unfiltered for the above application too.
  - [Java](https://adoptopenjdk.net/?variant=openjdk16&jvmVariant=hotspot "JDK download")  (Minimum version 16 must be installed, **only for development**)
  - Above Java Version needs to be installed in case you are using Linux or Mac.
   
  ### Compile/Build our own directly from source !
  *ABOVE TUTORIAL IS FOR WINDOWS ONLY !*
  1. Clone this Repo to local
  ```bash
  https://github.com/CodyNeeraj/Socketty-ClientEX.git
  ```

  2. Then atleast Java 16 installed in your system and then do the following

   -- **(For checking JDK is in path of Env. ?)**
  ```bash
  java -version
  ```
*  Fetching list of all the java files inside all sub-directories and copying them inside a file named details.txt
```bash
dir /s /b *.java > details.txt
```
* Compiling all the files captured in the above details.txt.
```bash
mkdir output && 
javac -cp libs/* -d output @details.txt
```
* Don't forget to copy the Library folder with the compiled jar to, forgetting this will cause *ClassNotFoundError*.
* Making A jar file out of it now, take all the packages of *.classes and take the fonts and icons folder then zip all the files now with a name of *codyneeraj_Client.jar* and then run
```bash
 cd output && 
 jar cvfe codyneeraj_Client.jar main.ServerMain .
```
```bash
 move codyneeraj_Client.jar ..\
```
* Now we have a JAR containing all the resources but no classpaths so to run the jar executable do
```bash
cd .. && 
java -cp "codyneeraj_Client.jar;libs\*" main.ServerMain
```
* You can also copy all the dependancies inside library folder (by removing the META-INF directory) from each and every zipped Jar file and then copy all the pure dependancy core directories to the root of output folder where we've placed other resource directories too, this will result a FAT jar file which is portable to a much higher extent and don't require any other dependancy to rely on !!

> Not getting the required output result..?, you've probably did something wrong unintentionally :confused: !

Native Packing Tutorial COMING SOON !!
## License
Original Developer- [Neeraj](https://github.com/CodyNeeraj)
> **Project's License  > [MIT's License](https://opensource.org/licenses/MIT)** MIT ©
 
**DOWNLOADING** :
Anyone is free to download the executables without any consent of developer and can use them for your OS without any hesitation.
 
**DEVELOPMENT** :
This software is licensed under MIT License any Commercial use can't be done without asking the developer and liability to use all these sources must be in hand of developer only, you may need to ask me for using this in your project by giving credit to the native developer :stuck_out_tongue_winking_eye:
## Downloads 
Download the latest precompiled [binaries here](https://github.com/CodyNeeraj/Socketty-ClientEX/releases/latest) ⬇️⬇️⬇️

 ## Feedback
 - Your feedback is important to me so please give a feedback.
