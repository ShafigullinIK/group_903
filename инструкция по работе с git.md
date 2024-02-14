git config --global user.name "Your name" - имя для представления
git config --global user.email "your@email.address" - email для представления
git init - создание (инициализация) репозитория
git status - просмотр состояния репозитория
git add <имя файла> - добавить файл <имя файла> в репозиторий для отслеживания
git add . - добавить все файлы
git commit -m "<информация об изменениях>" - добавить commit
git commit --amend -m "<информация об изменениях>" - изменение последнего commit
git log - посмотреть изменения
git log --graph - расширенное отображение лога при работе с ветками
git diff - просмотр списка изменений, внесенных в репозиторий
git checkout <ID> - переход к состоянию commit c определенным <ID>
git checkout <master, или название другой ветки> - переход в нужную ветку
git branch - посмотреть список веток и в какой ветке находимся
git branch -a - посмотреть список удаленных веток
git branch <название ветки> - создать новую ветку
git branch -d <название ветки> - удалить ветку, слияние которой произведено
git branch -M master - назначить ветку master основной
git merge <название метки> - слияние указаной ветки с основной master, находясь в master
git clone <internet address> - копировать удаленный репозиторий на компьютер
git remote add origin <internet address> - информируем, c каким удаленным репозиторием будем работать
git remote -v - просмотр адресов удаленных репозиториев
git push -u origin master - направить локальный репозиторий в удаленный (ветка master)
git push --set-upstream origin <branch> - перейти к управлению веткой <branch>
git push - дальше можно без -u origin master
git pull  - стянуть с удаленного репозитария (включая слияние merge)