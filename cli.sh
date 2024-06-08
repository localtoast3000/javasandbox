#!/bin/bash

source "$(dirname "$0")/commands/styles.sh"
source "$(dirname "$0")/commands/build.sh"
source "$(dirname "$0")/commands/run.sh"
source "$(dirname "$0")/commands/clean.sh"
source "$(dirname "$0")/commands/help.sh"


if [ "$1" == "build" ]; then
    echo ""
    build
elif [ "$1" == "run" ]; then
    echo ""
    run
elif [ "$1" == "clean" ]; then
    echo ""
    clean
elif [ "$1" == "help" ] || [ -z "$1" ]; then
    echo ""
    help
else
    echo ""
    danger "Invalid command: $1"
    echo ""
    help
    echo ""
fi