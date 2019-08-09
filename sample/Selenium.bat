@echo on
SET PROJECT_PATH=C:\Users\SharanammaAwale\workspace\mavenLearning

cd /C %PROJECT_PATH%

call mvn clean
call mvn test

pause