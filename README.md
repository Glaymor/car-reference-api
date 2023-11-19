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







