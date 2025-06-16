#!/usr/bin/env bash

git init
git add build.sbt
git add project/build.properties
git add ./src/**/*.scala
git add .gitignore
git add .github/**/*.yml

rm ./git-init.sh

