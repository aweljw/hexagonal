## Hexagonal Architecture

## layer classification

### adapter
### application
### domain

## package structure

```
project
    - adapter
        - in
            - web
                - request
                Controller
        - out
            - external library
    - application
        - port
            - in
                - command
                UseCase
            - out
                Port (external library interface)
    - domain
        domain class
```
