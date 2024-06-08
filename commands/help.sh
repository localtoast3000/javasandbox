#!/bin/bash

source "$(dirname "$0")/commands/styles.sh"

help() {
    echo ""
    echo ""
    echo ""
    echo ""
    tput rmam
    info "        ██╗ █████╗ ██╗   ██╗ █████╗     ███████╗ █████╗ ███╗   ██╗██████╗ ██████╗  ██████╗ ██╗  ██╗ "
    info "        ██║██╔══██╗██║   ██║██╔══██╗    ██╔════╝██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔═══██╗╚██╗██╔╝ "
    info "        ██║███████║██║   ██║███████║    ███████╗███████║██╔██╗ ██║██║  ██║██████╔╝██║   ██║ ╚███╔╝  "
    info "   ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║    ╚════██║██╔══██║██║╚██╗██║██║  ██║██╔══██╗██║   ██║ ██╔██╗  "
    info "   ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    ███████║██║  ██║██║ ╚████║██████╔╝██████╔╝╚██████╔╝██╔╝ ██╗ "
    info "   ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝  "
    echo ""
    echo ""
    echo ""
    echo "Usage: ./cli.sh [command]"
    echo ""
    echo "Commands:"
    echo ""
    echo "   build    Compile the Java program"
    echo "   run      Compile and run the Java program"
    echo "   clean    Remove the build directory"
    echo "   help     Show this help message"
    tput smam
    echo ""
    echo ""
    echo ""
}