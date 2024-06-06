# Coding Guidelines

## Language Guidelines

We use english language. This is to be consistent everywhere, and to be considerate with developers that do not speak our native language.

Therefore: source code, comments, documentation, commit messages, review comments, and any other kind of contribution MUST use english language.

Typos are unavoidable, but try to reduce them by using a spellchecker. Most IDEs can be configured to run one automatically.

## Code

We want our code to be resistant to the passage of time and also to its growth. With the API already stable, the code
will be read much more frequently than it is written, which is why we prefer the code to be tedious to write but easy to
read.

In this context, the objective of these guidelines is to manage the complexity of our code. Below you will find a list
of tools and guides to help you in that regard:

- Follow  [How to Write a Git Commit Message](https://cbea.ms/git-commit/).
- Follow  [clean architecture pt1](https://lafilosofiadelsoftware.com/index.php/2021/06/03/clean-architecture-parte-1/) [clean architecture pt1](https://lafilosofiadelsoftware.com/index.php/2021/06/03/clean-architecture-parte-2/).
- Prepare your [environment to activate our hooks](#environment) that validate code and tests before each commit.
- All new code must contains quality tests that validate the new rules.

The important thing is that you are aware when you make a contribution, and try to follow the same style that is already
used in the code. If you have any questions, do not hesitate to ask us!

## Branching Guidelines

- We mainly accept guidelines defined in [Gitflow](https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow).

## Development Tips and Environment Tools

### App Specs

This app is written in Java 17 and works with java 11. In order to contribute to this project, you must provide code tested to keep our
coverage as high as possible.[How to Write Unit Test](https://lafilosofiadelsoftware.com/index.php/2021/06/11/como-hacer-buenas-pruebas-a-nuestro-codigo/).

### Environment

To prepare your environment, we recommend running the command bellow, as it add our `pre-commit hook`
to ensure some rules before pushing code. To include it you must run just once (*or when script updated*):


### Editor Configuration

To avoid having different spacing or configurations that can lead to confusion. we have a .editorconfig file

#### Required environments

Some environments variables are necessary to run application:

* SPRING_PROFILES_ACTIVE=local

### Dependency Management

This app manages its dependencies using gradle, in this topic there are some instructions on how to prepare your
environment to have it working. your need vpn for this


