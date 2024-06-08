#!/bin/bash

source "$(dirname "$0")/commands/styles.sh"
source "$(dirname "$0")/commands/build.sh"


run() {
    build
    if [ $? -eq 0 ]; then
        info "Running the program..."
        echo ""
        java -cp build Main
        echo ""
    else
        danger "Build failed. Program will not run."
        echo ""
    fi
}