# SwaggerCodeGen

Generate Java server code from OpenBanking swagger file
Swagger file from: https://github.com/OpenBankingUK/opendata-api-spec-compiled/blob/master/opendata-swagger.json


## Build

$ mvn clean package

## Run

$ java -jar target/SwaggerCodeGen-0.0.1-SNAPSHOT.jar

## Test

$ curl -v -X GET --header 'Accept: application/prs.openbanking.opendata.v1.3+json' 'http://localhost:8080/atms'


