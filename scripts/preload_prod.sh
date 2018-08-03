#!/usr/bin/env bash

set -e

docker pull mongo

docker pull nginx

docker pull 10.100.198.200:5000/migs-base

docker pull gliderlabs/registrator