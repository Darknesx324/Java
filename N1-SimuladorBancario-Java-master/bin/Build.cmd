@echo off

REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad Santiago de Cali (Santiago de Cali - Colombia)
REM Departamento de Ingeniería de Sistemas y Computación
REM Licenciado bajo el esquema Academic Free License version 2.1
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: N1-Elecciones-Java
REM Autor: Joan Andrés Buriticá Salazar
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Asegura la creación de los directorios classes y lib
REM ---------------------------------------------------------

cd ..

mkdir classes
mkdir lib

REM ---------------------------------------------------------
REM Compila las clases del directotio source
REM ---------------------------------------------------------

cd src

javac -encoding UTF8 -d ../classes/ edu/jabs/simubanca/mundo/*.java
javac -encoding UTF8 -d ../classes/ edu/jabs/simubanca/interfaz/*.java
javac -encoding UTF8 -d ../classes/ edu/jabs/simubanca/util/*.java

REM ---------------------------------------------------------
REM Crea el archivo jar a partir de los archivos compilados
REM ---------------------------------------------------------

cd ..
cd classes

jar cf ../lib/simuladorBancario.jar edu/*

cd ../bin

pause