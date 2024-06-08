#!/bin/bash

source "$(dirname "$0")/commands/styles.sh"

clean() {
    cd "$(dirname "$0")"

    if [ -d "build" ]; then
        rm -rf build
        success "Build directory cleaned."
        echo ""
    else
        danger "Build directory does not exist."
        echo ""
    fi
}