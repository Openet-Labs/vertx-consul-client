#!/bin/bash -ex

mvn clean install

VERSION=`grep -Pom2 "(?<=<version>)[^<]+" "pom.xml"|tail -1`

if [[ "$VERSION" =~ "-SNAPSHOT" ]]
then
  USERNAME=$SNAPSHOT_USERNAME
  PASSWORD=$SNAPSHOT_PASSWORD
  URL=http://artifactory.openet-telecom.lan:8081/artifactory/ext-snapshot-local
else
  USERNAME=$RELEASE_USERNAME
  PASSWORD=$RELEASE_PASSWORD
  URL=http://artifactory.openet-telecom.lan:8081/artifactory/ext-release-local
fi

mvn -s settings.xml deploy:deploy-file -DrepositoryId=artifactory -Durl=$URL -DpomFile=pom.xml -Dfile=target/vertx-consul-client-${VERSION}.jar -Dartifactory.username=${USERNAME} -Dartifactory.password=${PASSWORD}


