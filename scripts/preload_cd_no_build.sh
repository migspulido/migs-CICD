#!/usr/bin/env bash

git clone https://github.com/migspulido/migs-base.git

set -e

cd migs-base

docker pull migspulido/migs-base

docker tag migspulido/migs-base 10.100.198.200:5000/migs-base

docker push 10.100.198.200:5000/migs-base
docker pull mongo

docker pull jenkins

apt-get install -y openjdk-7-jdk