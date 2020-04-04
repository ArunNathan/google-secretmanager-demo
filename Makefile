# Pass the following environment variables while calling the command \
GCP_PROJECT - the gcp project id \
VERSION - the version for this deployment

.PHONY: build
build:
	mvn clean package

# package & deploy the app to appengine
.PHONY: deploy
deploy:
	make build
	mvn appengine:deploy -Dapp.deploy.projectId=$(GCP_PROJECT) -Dapp.deploy.version=$(VERSION)