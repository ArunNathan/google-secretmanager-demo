# Google Secret Manager demo app

A Demo app for accessing secrets using Google Secret Manager, based on the Medium article, [Managing application secrets like a Pro using Google Secret Manager](https://medium.com/swlh/google-cloud-run-service-with-grpc-using-spring-boot-e43daf155752)

## How to use?

### Running the app 

Start the server by running the following command, 
```shell script
mvn spring-boot:run
```
### Deploying

Deploy to appengine using the following command, 


```shell script
mvn clean package appengine:deploy \
-Dapp.deploy.projectId=GCP_PROJECT \
-Dapp.deploy.version=VERSION
```

replace `GCP_PROJECT` & `VERSION` with your desired gcloud project & version 
