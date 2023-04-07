# Spring-http

Spring-http repository contains files created to practice Spring (Model-View-Controller (MVC) pattern, Thymeleaf template). 

1. Controller which allows to change the color of text with buttons:
   - [colors html](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/resources/templates/kolorki.html), [colors](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/java/pl/edu/wszib/http2/Kolorki.java): @Controller, @RequestMapping, @GetMapping, @ResponseBody, @RequestParam

2. Controller which allows to upload images and display them in gallery:
   - [gallery html](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/resources/templates/galeria.html), [gallery controller](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/java/pl/edu/wszib/http2/GaleriaController.java): @Controller, @RequestMapping, @GetMapping, @PostMapping, @RequestParam, @ResponseBody, @PathVariable

3. Controller which allows to create user profile (id, name, surname, birthday) with photo. It allows to edit or delete the profile, with controller which allow to upload the files.
   - [profile html](https://github.com/klimkowskaewa/Spring-http/tree/master/src/main/resources/templates/profile), [exception](https://github.com/klimkowskaewa/Spring-http/tree/master/src/main/java/pl/edu/wszib/http2/service/exception), [controller](https://github.com/klimkowskaewa/Spring-http/tree/master/src/main/java/pl/edu/wszib/http2/controller): @RestController, @RequestMapping, @PostMapping, @RequestParam, @GetMapping, @Controller, @Autowired, @ExceptionHandler, @ResponseBody


4. Application which allows user to create a new task, assign them a title, status and due date. It has internationalization so the page can be display in Polish and English:
   - [to do html](https://github.com/klimkowskaewa/Spring-http/tree/master/src/main/resources/templates/todos), [to do](https://github.com/klimkowskaewa/Spring-http/tree/master/src/main/java/pl/edu/wszib/http2/todo): @Service, @Autowired, @Controller, @GetMapping, @PostMapping, @RequestMapping, @RequestParam
   - [I18NConfig](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/java/pl/edu/wszib/http2/I18NConfig.java): @Bean, @Configuration, @Override
   - [to do service](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/java/pl/edu/wszib/http2/service/ToDoService.java): @Service
   - [to do status](https://github.com/klimkowskaewa/Spring-http/blob/master/src/main/java/pl/edu/wszib/http2/service/model/ToDoStatus.java)

