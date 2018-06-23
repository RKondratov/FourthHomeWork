#language: ru
  Функционал: Страхование
    Сценарий: Заявка на страхование в путешествие на минимальную сумму без указания контактных данных.
      Когда выбран пункт меню "Страхование"
      И выбран вид страхования "Путешествия и покупки"
      Тогда проверли заголовок страницы

      Когда нажали на кнопку
      И выбрана сумма страховой защиты "Минимальная"
      И выбран пол "female"
      И заполняются поля:
      |insuredName|Arthas|
      |insuredSurname|Menethil|
      |insuredBirthDate|22.06.1941|
      |surname|Иванова|
      |name|Ивана|
      |middlename|Иванович|
      |birthDate|09.05.1945|
      |passportSeries|9999|
      |passportNumber|999999|
      |issueDate|12.12.2012|
      |issuePlace|Azeroth WoW|
      Тогда проверили значения полей:
        |insuredName|Arthas|
        |insuredSurname|Menethil|
        |insuredBirthDate|22.06.1941|
        |surname|Иванова|
        |name|Ивана|
        |middlename|Иванович|
        |birthDate|09.05.1945|
        |passportSeries|9999|
        |passportNumber|999999|
        |issueDate|12.12.2012|
        |issuePlace|Azeroth WoW|

      Когда нажали на "Продолжить"
      Тогда проверли всплывающее сообщение "Заполнены не все обязательные поля"



  
