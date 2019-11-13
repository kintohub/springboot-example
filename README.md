# KintoHub Spring Boot Example

## Overview

Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". It can be built easily for microservice on KintoHub!

[Live Example](https://8caf94bb-c2e5-45cf-898d-ca5b19954cda.api.master.kintohub.com/springboot-example/hello/world)

__About KintoHub:__

KintoHub aligns teams to ship & operate cloud native apps with ease. [Learn More](https://www.kintohub.com)

## Deployment
1. Apply this template to your [Github](https://github.com/kintohub/springboot-example/generate)
2. Create a [Microservice Block](https://docs.kintohub.com/docs/kintoblocks/microservices) on KintoHub
3. Connect your GithubApp to KintoHub and select the Repository you just generated on your account.
4. Set the **name** of your kinto block
5. Choose `Java` as the **language** and `openjdk-8-alpine` as the **version**
6. Set the **Build Command** as `./mvnw clean package`
7. Set the **Start Command** as `java -jar ./target/springboot-example-1.0.0.jar`
8. Set the **Port** as `80`

You're now good to go! Click **Create Microservice**. Now click **Build Latest Commit**

Once complete, Click **Add to Project** 
NOTE: Please assign at least **256MB** memory for your Java microservice block during the deployment.

Follow the instruction to create a new project. Once created, you should be able to [access your API endpoints](https://docs.kintohub.com/docs/features/operating/accessing-endpoints).

## Installation & Local Run
Ensure you have Java 8 or higher.
```
./mvnw spring-boot:run
```

## Usage
### Optional Environment Variables
Default value  = `Hello`, please refer to the `.env-example` file
```
GREETING=Hi
```

### API Call
Local:
```
curl -X GET http://localhost/hello/world
```

On KintoHub:
```
curl -X GET http://<EnvironmentHostName>/<KintoBlockName>/hello/world
```
Please refer to [Accessing API Endpoints](https://docs.kintohub.com/docs/features/operating/accessing-endpoints) for the setup instruction

Try this [Live Example](https://8caf94bb-c2e5-45cf-898d-ca5b19954cda.api.master.kintohub.com/springboot-example/hello/world) !

### Response
```json
{
  "message": "Hello world"
}
``` 

## What's Next?

You can do a lot with KintoHub and your deployed application. Some helpful links for next steps that you may consider with this project.

* [Creating multiple environments](https://docs.kintohub.com/docs/projects/environments)
