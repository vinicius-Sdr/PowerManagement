# 📁 PowerManagement

API que um portal poderá consumir para apresentar aos usuários os dados de consumo de cada eletrodoméstico.

_________________________________

## End-point: /Adress
Gerenciamento de Endereços.

#### http://localhost:8080/address


### Methods: 


## POST - Create new adress

>```
>http://localhost:8080/address
>```

#### Body (**json**)
```
{
  	"street": "rua",
    "number": "723",
    "neighborhood": "bairro",
    "city": "SP",
    "state": "SPSP",
    "complement": "não tem"
}
```
#### Response
```
{ No response body }
```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - List all endress

#### Example Request
>```
>http://localhost:8080/address
>```


#### Example Response
```
[
    {
    "street": "avenida",
    "number": "723",
    "neighborhood": "bairro",
    "city": "Sao Paulo",
    "state": "SP",
    "complement": "Apto 109"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - Find By Id
>```
>http://localhost:8080/address/1
>```

#### Example Response
```

{
    "id":1,
    "street": "avenida",
    "number": "723",
    "neighborhood": "bairro",
    "city": "Sao Paulo",
    "state": "SP",
    "complement": "Apto 109"
}

```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## DELETE - Delete By Id
>```
>http://localhost:8080/address/1
>```

#### Example Response
```

{
    "Endereço deletado com sucesso!"
}

```

_________________________________________________

## End-point: Users
Gerenciamento de Usuarios.

#### http://localhost:8080/user

### Methods: 

## POST - Create new user

>```
>http://localhost:8080/users
>```

#### Body (**json**)
```
{
    "name": "Ana Maria Souza",
    "birthDate": "10/10/1988",
    "gender": "Feminino",
    "relationship": "Irmã"
}
```
#### Response
```
{ No response body }
```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - List all users

#### Example Request
>```
>http://localhost:8080/users
>```


#### Example Response
```
[
    {
        "id":"1",
        "name": "Ana Maria Souza",
        "birthDate": "10/10/1988",
        "gender": "Feminino",
        "relationship": "Irmã"
    },
    {
        "id":"2",
        "name": "Joao Souza",
        "birthDate": "05/09/1986",
        "gender": "Masculino",
        "relationship": "Pai"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - Find By Id
>```
>http://localhost:8080/users/1
>```

#### Example Response
```

{
    "id":"1",
    "name": "Ana Maria Souza",
    "birthDate": "10/10/1988",
    "gender": "Feminino",
    "relationship": "Irmã"
}

```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## DELETE - Delete By Id
>```
>http://localhost:8080/users/1
>```

#### Example Response
```

{
    "Usuario deletado com sucesso!"
}

```

_________________________________________________


## End-point: Appliance
Gerenciamento de Eletronicos.

#### http://localhost:8080/appliance


### Methods: 


## POST - Create new Appliance

>```
>http://localhost:8080/appliance
>```

#### Body (**json**)
```
{
    "name": "Forno Eletrico",
    "model": "Forno Eletrico LG",
    "potency": "500 W"
}
```
#### Response
```
{ No response body }
```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - List all users

#### Example Request
>```
>http://localhost:8080/appliance
>```


#### Example Response
```
[
    {
        "id":"1",
        "name": "Forno Eletrico",
        "model": "Forno Eletrico LG",
        "potency": "500 W"
    },
    {
        "id":"2",
        "name": "Ar condicionado",
        "model": "Ar condicionado 10.000 BTU",
        "potency": "1400 W"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - Find By Id
>```
>http://localhost:8080/appliance/1
>```

#### Example Response
```

{
    "id":"1",
    "name": "Forno Eletrico",
    "model": "Forno Eletrico LG",
    "potency": "500 W"
}

```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## DELETE - Delete By Id
>```
>http://localhost:8080/appliance/1
>```

#### Example Response
```

{
    "Eletronico deletado com sucesso!"
}

```

_________________________________________________


## End-point: Person
Gerenciamento de pessoas.

#### http://localhost:8080/person


### Methods: 


## POST - Create new Person

>```
>http://localhost:8080/person
>```

#### Body (**json**)
```
{
    "name": "Bruno",
    "birthDate": "10/12/2022",
    "gender": "male",
    "kinship": "irmão",
    "addressId": 3,
    "userId": 4
}
```
#### Response
```
{
    "id": 3,
    "name": "Bruno",
    "kinship": "irmão",
    "gender": "male",
    "birthDate": "2022-12-10T03:00:00.000+00:00"
}
```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - List all persons

#### Example Request
>```
>http://localhost:8080/person
>```


#### Example Response
```
[
    {
        "id": 3,
        "name": "Bruno",
        "kinship": "irmão",
        "gender": "male",
        "birthDate": "2022-12-10T03:00:00.000+00:00"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## GET - Find By Id
>```
>http://localhost:8080/person/1
>```

#### Example Response
```

{
    "id": 1,
    "name": "bruno",
    "kinship": "irmao ",
    "gender": "male",
    "birthDate": 20-10-2001
}

```
⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## DELETE - Delete By Id
>```
>http://localhost:8080/person/1
>```

#### Example Response
```

{
    "Pessoa deletado com sucesso!"
}

```
