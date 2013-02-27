#! /bin/bash

targetDirectory='out/artifacts/flume_kestrel/flume_kestrel.buildinfo.txt'
git log -n 5 > $targetDirectory
