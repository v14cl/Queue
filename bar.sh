#!/bin/bash

set -e

mvn package
java -cp target/Queue-1.0.jar com.testproj.app.App
