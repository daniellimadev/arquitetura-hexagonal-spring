# Arquitetura Hexagonal feita em Spring

Esse projeto foi feito para plástica sobre a arquitetura Hexagonal, podendo ter sido feito com qualquer outra linguagem ou framework.

# Tecnologias utilizadas

* **Languagem:** Java 17
* **Versionamento:** Git/GitHub
* **IDE:** IntelliJ IDEA Community Edition
* **Banco de dados:** Postgres
* **Framework:** Spring Boot

<br>

## ✏️Exemplo de arquitetura Hexagonal

##### Hexagonal Architecture
![img/Hexagonal Architecture.drawio.png](https://github.com/daniellimadev/arquitetura-hexagonal-spring/blob/main/img/Hexagonal%20Architecture.drawio.png)

##### Modelo
![img/modelo.png](https://github.com/daniellimadev/arquitetura-hexagonal-spring/blob/main/img/modelo.png)


## Para rodar a app na sua máquina

Execute esse comando em sua IDE ou linha de comando preferida:
```shell script
mvn spring-boot:run
```

## API Endpoints

Para realizar as requisições HTTP abaixo foi utilizada a ferramenta [Postman](https://www.postman.com/):

- Criar usuario
```
$ POST http://localhost:8080/usuario

[
  {
  "nome": "Nome",
  "instagram": "Instgram",
  "linkedin": "Linkedin",
  "github": "Github",
  "dataNascimento": "2000-02-16",
  "cep": "07243090"
  }
]
```

## Swagger ui

##### Swagger
![img/01.swagger.png](https://github.com/daniellimadev/arquitetura-hexagonal-spring/blob/main/img/01.swagger.png)

![img/02.swagger.png](https://github.com/daniellimadev/arquitetura-hexagonal-spring/blob/main/img/02.swagger.png)

<br>

<h3>Autor</h3>

<a href="https://www.linkedin.com/in/danielpereiralima/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/96916005?v=4" width="100px;" alt=""/>

Feito por Daniel Pereira Lima 👋🏽 Contato!

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/danielpereiralima/)](https://www.linkedin.com/in/danielpereiralima/)
