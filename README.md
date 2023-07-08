# DistributedSystems

## General Information
 
Repository for the project of the lecture distributed systems. A small application that displays a list of animals. The user is able to add, edit and delete animals. Furthermore it has a filter function to filter through the animals based on their species and their attributes. With the help of the search field one can search for a specific breed. 


## Set up for development

### Frontend

The frontend is using the angular framework. In order to set up the project one has to install angular on their local machines. 

#### On Linux Ubuntu:

First install nodejs:

```bash 
$ curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash - && sudo apt-get install -y nodejs
```

Check the version: 

```bash
$ node -v
```

One should get something like this:

```bash
$ v18.16.1
```

After that one can get the latest version of npm (optional):

```bash
$ sudo npm install npm@latest -g
```
Check the version: 

```bash
$ npm -v
```

The feedback should look like this:

```bash
$ 9.7.2
```

 Now install angular/cli:

```bash
$ sudo npm install -g @angular/cli
```

Check the version: 

```bash
$ ng version
```

The feedback should look like this:

```bash
     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/
    

Angular CLI: 16.1.1
Node: 18.16.1
Package Manager: npm 9.7.2
OS: linux x64

Angular: 
... 

Package                      Version
------------------------------------------------------
@angular-devkit/architect    0.1601.1 (cli-only)
@angular-devkit/core         16.1.1 (cli-only)
@angular-devkit/schematics   16.1.1 (cli-only)
@schematics/angular          16.1.1 (cli-only)

```

### Backend
The Backend language used for this project is Java 17. While the framework Springboot is used, it requires no further installation process.

To install Java 17, first check if there is already a version installed.

#### On Linux Ubuntu
```bash
$ java -version
```

If it is the output will look somewhat like this:

```bash
Command 'java' not found, but can be installed with:
sudo apt install default-jdk
sudo apt install default-jre
```
Before installation first run the command: 

```bash
$ sudo apt-get update
```

Now to the actual installation, run the command:

```bash
$ sudo apt install openjdk-17-jdk openjdk-17-jre
```
When running the command:

```bash
$ java -version
```
The output should look somewhat like this:

```bash
openjdk version "17.0.7" 2023-04-18
OpenJDK Runtime Environment (build 17.0.7+7-Ubuntu-0ubuntu120.04)
OpenJDK 64-Bit Server VM (build 17.0.7+7-Ubuntu-0ubuntu120.04, mixed mode, sharing)
```

### IDE
The choice of an IDE is of course for the developer to make. So this part covers the personally preferred IDEs for a project like this.

#### Visual Studio Code
 For the frontend the IDE Visual Studio Code was used.
 
 To get Visual Studio Code simply follow this [Link](https://code.visualstudio.com/Download) and choose the version for the operating system of the local machine used for this project.

#### Eclipse
For the backend the IDE Eclipse was used.

To get it, simply follow the instructions of the [Eclipse Foundation](https://www.eclipse.org/downloads/packages/installerhttps://www.eclipse.org/downloads/packages/installer)   