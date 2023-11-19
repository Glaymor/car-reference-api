# car-reference-api

REST API приложение в стиле CRUD. Приложения для хранения, изменения списка автомобилей. 
Технологии: Play Framework Slick Postres

О приложении:

Структура 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/0542a308-61d0-4896-b95b-1bab6539fe6e)

Приложение содержит два контроллера, для обработки запросов. StatController содержит за статистические методы, CarController основные методы для работы с справочником.

Контроллеры обращаются к сервисам.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/7e1e23e5-5a7d-4636-bad9-3205069e6fd3)

В репозитории идет обращение к базе данных.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/62fa650f-164f-42d3-b4db-274b2579252f)

Приложение подразумевает справочник автомобилей, так как номер машины уникален - он и является ключем в базе данных. Если добавить авто, номер которого уже есть в базе данных - приложение обновит информацию новыми данными. 

Поддерживаются все основные запросы: 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/e48ab3cf-3aee-463e-8b9c-118ac6a2ae56)

Примеры:

Стартовая страница.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/def3cf48-80e7-459c-8670-21dbdf7b0dd1)

Получение всех автомобилей

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/0c1f27d4-b8ab-4c46-9ad2-0258caef5078)

Получение всех цветов

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/8fa5a445-dc50-4635-bbac-0bdfce9cfca9)

Получение всех автомобилей с белым цветом 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/e389ce36-5b76-4cc5-ba85-90a29976a6dc)

Добавление авто

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/7298ffa3-3144-4582-bcfc-a2880f42e6df)

Получение авто по номеру

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/9929764d-2ba9-434e-9ba0-1004c49e49b9)














