#!/usr/bin/env bash

git init
git add build.sbt
git add project/build.properties
git add ./src/**/*.scala
git add .github/**/*.yml
git add .gitignore
git branch -m master main
git commit -a -m '[init] Initial commit'

echo "[INFO] You can now remove ./git-init.sh"

