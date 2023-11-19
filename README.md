# car-reference-api

REST API приложение в стиле CRUD. Приложения для хранения, изменения списка автомобилей. 
Технологии: Play Framework Slick Postres

О приложении:

Структура 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/0d54be08-dd99-4ec5-8d35-d2901478beb6)

Приложение содержит два контроллера, для обработки запросов. StatController содержит за статистические методы, CarController основные методы для работы с справочником.

Контроллеры обращаются к сервисам.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/61892453-b5fb-40a3-8080-128f5a8b2d40)

Сервисы обращаются к репозиторию.
В репозитории идет обращение к базе данных.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/6c563851-c31a-4a8e-b8d5-b361cf821bf7)


Приложение подразумевает справочник автомобилей, так как номер машины уникален - он и является ключем в базе данных. Если добавить авто, номер которого уже есть в базе данных - приложение обновит информацию новыми данными. 

Поддерживаются все основные запросы: 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/112c549f-1e01-4e5c-a99a-90425e84232c)


Примеры:

Стартовая страница.

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/6c4bfa24-6041-447b-9c87-55c62ca8d84a)


Получение всех автомобилей

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/c73a9d71-e50e-4681-8f99-888cb8518bbf)


Получение всех цветов

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/e9978d43-6feb-48c0-b1b1-e253c543070d)


Получение всех автомобилей с белым цветом 

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/19887b29-4dd8-4eda-80e0-d03adc72548e)


Добавление авто

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/8f385480-2b42-4d07-a822-5d0542f8a0d1)


Получение авто по номеру

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/f510061e-d121-472d-bf1b-09b6492737dc)


Удаление

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/c21f2fd4-ba82-4bdc-bccf-8eb175505f1f)

Получение всех авто по марке

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/4c469a06-ac0c-4c47-b281-81a1484f8464)

![image](https://github.com/Glaymor/car-reference-api/assets/91942559/7cfcb9c9-7cd9-4744-b1bf-b9371eb26e57)


















