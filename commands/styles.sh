#!/bin/bash

danger() {
    echo -e "\033[0;31m$1\033[0m"
}

success() {
    echo -e "\033[0;32m$1\033[0m"
}

warning() {
    echo -e "\033[1;33m$1\033[0m"
}

info() {
    echo -e "\033[1;34m$1\033[0m"
}

nocolor() {
    echo -e "\033[0m$1\033[0m"
}