Лабораторная работа №1
Выполнил студент 3 курса, группа 151004, Гайко Александр.

Предмет - веб-технологии.

* Каждая папка в репозитории - это отдельный проект Gradle, который должен быть открыт через IntelliJ IDEA или импортирован в Eclipse IDE.
* Используемая версия Gradle - 8.4.
* Используемая версия Java - 8.
* Используемая версия JDK - Eclipse Temurin 1.8.0_392.

Условия заданий
  
Задание 1

Вычислить значение выражения по формуле (все переменные принимают действительные значения).
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 2

Для данной области составить программу, котораяпечатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 3

Составить программу для вычисления значений функции `F(x) = tan(x)` на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 4

Задан целочисленный массив размерности N. Определить, есть ли среди элементов массива простые числа. Если да, то вывести номера этих элементов. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 5

Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно выкинуть из данной последовательности, так чтобы осталась возрастающая подпоследовательность. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 6

Даны действительные числа a1, a2, …, an. Получить следующую квадратную матрицу порядка n. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 7

Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 8

Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= … <=an и b1 <= b2 <= … <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= … <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей. 
Для модульного тестирования приложения разработайте JUnit-тесты.

Задание 9

Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков. 
Для модульного тестирования приложения создать JUnit-тесты.

Задание 10

Скомпилировать и запустить приложение, созданное при решении задачи 9 из командной строки.

Задание 11

Создать запускной jar-файл и запустить приложение, созданное при решении задачи 9.

Задание 12

Не пользуясь средствами автогенерации кода переопределить для класса Book методы equals(), hashCode() и toString().

Задание 13

Не пользуясь средствами автогенерации кода переопределить для класса ProgrammerBook методы equals(), hashCode() и toString().

Задание 14

Не пользуясь средствами автогенерации кода переопределить для класса Book из задачи 12 метод clone(). 
Напишите тесты JUnit, проверяющие корректность клонирования.

Задание 15

Реализовать интерфейс Comparable.
Добавьте в класс Book из задачи 12 поле isbn. Реализуйте в классе Book интерфейс Comparable так, чтобы книги приобрели сортировку по умолчанию согласно номеру isbn. 
Напишите тесты JUnit, проверяющие корректность сортировки.

Задание 16

Реализовать интерфейс Comparator.
Реализуйте для класса Book из задачи 12 компараторы, позволяющие сортировать книги по названию; по названию, а потом по автору; по автору, а потом по названию; по автору, названию и цене.
Напишите тесты JUnit, проверяющие корректность сортировок.
