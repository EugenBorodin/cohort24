## Page Object Model

паттерн программирования, основная идея которого состоит в том, чтобы описать каждую страницу веб-приложения в виде объекта класса. Взаимодействие пользователя со страницей осуществляется с помощью методов класса. Тест, использующий POM, должен описывать бизнес-логику тестового сценария и скрывать Selenium-методы взаимодействия с браузером и страницей. При изменениях в верстке страницы не придется исправлять тесты, связанные с этой страницей. Вместо этого нужно будет поправить только класс, описывающий страницу.

То есть здесь применяются те же принципы, что и в разработке: мы хотим повысить читаемость кода и вынести в абстрактные методы все детали.
Тесты должны быть просто и понятно написаны, а повторяющиеся куски кода выделены в отдельные функции.

Общая рекомендация: тесты не должны зависеть от того, что невозможно контролировать, например, некая информация, уже хранящаяся в базе данных, или сторонние сервисы, которые использует приложение. Следует проверять конкретные данные только в случае, когда используется специально подготовленная тестовая база, инициируемая перед каждым запуском тестов, или добавляются нужные данные в базу данных напрямую или через API приложения.

Другое важное замечание: хороший тест проверяет только маленькую, атомарную часть функциональности. Простые тесты, которые проверяют небольшой сценарий, лучше, чем один большой тест, проверяющий сразу много сценариев. Благодаря простым тестам мы быстрее локализуем место в продукте, где появился баг, а также можем найти одновременно несколько новых багов. Упавший большой автотест укажет только на первую встреченную проблему, так как он заканчивает работу при первой же найденной ошибке. В этом их отличие от ручных тестов, в которых мы проверяя функциональность продукта по тест-кейсу, можем гибко обойти встречающиеся проблемы и пройти тест-кейс до конца, найдя все баги.
Пишите максимально простой код везде, где это возможно.
Не используйте переусложненных конструкций без большой необходимости. Если кусок кода можно заменить конструкцией более простой для понимания — замените.
Пишите максимально линейный код, где это возможно, это проще для восприятия.
Избегайте большой вложенности блоков кода, такие конструкции тяжело читать.
Если можно вынести повторяющуюся логику куда-то, выносите, не повторяйтесь.

Называйте осмысленно переменные, методы и классы, которые вы создаете.
Имена тестов должны хорошо отражать различия в похожих сценариях. Можно использовать те же подходы, что и при добавлении имен к тест-кейсам в тестовой документации.

Удаляйте весь ненужный закомментированный код, помним, что захламлять репозиторий лишним — плохой тон.

Одинаковые тесты, которые отличаются только каким-то контентом (например, языком интерфейса), следует не копировать, а параметризовать.