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

REM ---------------------------------------------------------
REM Borra todos los archivos generados por el buildTest
REM ---------------------------------------------------------

cd ..
del classes\* /s /q
del lib\* /s /q

cd bin