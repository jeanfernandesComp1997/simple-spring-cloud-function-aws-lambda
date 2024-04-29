# simple-spring-cloud-function-aws-lambda
AWS Lambda function with Kotlin and Spring Cloud Function

## Run locally

Add  ```implementation 'org.springframework.cloud:spring-cloud-starter-function-web' dependency```

```
curl --location 'localhost:8080' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1
}'
```

## Config on AWS Lambda

Specify the handler with ``` org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest ```