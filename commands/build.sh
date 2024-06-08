#!/bin/bash

source "$(dirname "$0")/commands/styles.sh"

build() {
    cd "$(dirname "$0")"
    mkdir -p build
    javac -d build -sourcepath src src/Main.java

    if [ $? -eq 0 ]; then
        success "Compilation successful."
        echo ""
    else
        danger "Compilation failed. Please check for errors."
        echo ""
        exit 1
    fi
}