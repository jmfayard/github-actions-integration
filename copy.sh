#!/usr/bin/env bash

TARGET=.github/workflows
MESSAGE=$( git log --oneline  -n 1 --pretty='format:%s')

find ${TARGET} -name '*.yml'  -name '*.yaml' | xargs rm -f
cp -f workflows/* ${TARGET}
git add .
git commit -m "${MESSAGE}"
git push --force