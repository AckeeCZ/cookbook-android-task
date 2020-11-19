# Ackee Cookbook Android Version

Welcome, stranger! Wanna join us at [Ackee][1]? Or you just don't know what to do on a lazy sunday afternoon?

We have a tasty task for you! Create an Android version of our delicious Ackee recipes. We have everything you need to get you started
- API (and a running server)
- Designs
- Simple Android skeleton with all icons and assets (including Roboto font)

it should take you only a few hours to complete this task.

## API & Server
Documentation for the api can be found on [apiary][2] and the live server runs at this address [https://cookbook.ack.ee][3]. If you are Postman user, here's a [collection][4] for you.

## Designs
Application should contain these 3 screens. You can also download a Sketch app file over [here][5]

<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/01_list.png" width="200">&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/03_add.png" width="200">&nbsp;
<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/02_detail.png" width="200">&nbsp;&nbsp;&nbsp;


- List of recipes
- Form to add a new recipe (via the plus button)
- Detail of a recipe with rating (on a list item click)

### Tasks for you

- Write the app :)
- Use of best asynchronous programming practices (coroutines, Rx streams etc.) and Clean Architecture(MVVM, MVI, MVP, …) is a big advantage
- Application should be able to run on every device and every orientation 
- There are only a few recipes on the server, however you should take into consideration that the application should be able to deal with any number of recipes (some sort of paging should be implemented)!
- Application should cache its data so we can cook our delicious recipes even when offline.
- Use 3rd party libraries, technologies and frameworks as you wish. But have a good reason to use any of them, though.
- Life is Great and Everything Will Be Ok, Kotlin is Here! Since Kotlin is Google approved language for making Android apps and we love it as much as our delicious recipes, we want you to write this app in Kotlin.
- If you want to add anything extra, just go for it! (Psst, we ❤️ testing)
- Send us as link to your git repository or any other share services like Dropbox / GDrive / etc..

[1]:	https://ackee.cz
[2]:	http://docs.cookbook3.apiary.io/#introduction/recipes
[3]:	https://cookbook.ack.ee
[4]:	https://www.getpostman.com/collections/ba618ded390595fa4c81
[5]:	https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/ackee_cookbook.sketch
