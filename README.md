## Project dependencies
* Apache Tomcat v8.5
* sql connector included in lib folder
* MySql 

> Password for PhpMyadmin is  `""`  and password for MySQL Workbench is `"root"` 

> Make necessary adjustments in Dao class (master will have  `""`)

## How to run the app
* Import Book_List.sql in MySql database
* Import porject in eclipse and configure build path
> Configure build path -> Add Library -> add apache tomcat v8.5 folder

> Configure build path -> Add External jar -> add mysql connector 
* Start server and go to `http://localhost:8080/advJava` in your browser

## How to get a copy of the project
```
git clone https://github.com/Klaus-poppe/advJava
git checkout [apnaBranchName]  // (square brackets mat dalna)
```

## Before u start working 
```
git pull origin master
this command will make sure u r up to date with the main branch 
```
## When u want to upload your changes
```
git add .
git commit -m "short message about the commit"
git push origin [apnaBranchName]  // (square brackets mat dalna)
```
## If u wish to create a new branch 
```
git branch [branchName]
```

## Alloted branch names
* Ashwin Jawahar - master
* Arnav Ajav - arnav
* Gayathri Chandreshekar - gayathri


