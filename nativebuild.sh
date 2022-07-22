#!/bin/sh
$LLVM_TOOLCHAIN/clang -shared -o target/libcalculator.so src/calculator.cc
javac -classpath src -d target src/*.java
native-image -cp target --verbose -H:CLibraryPath=${PWD}/target Calculator dist/NativeCalculator