# graalvm-hello-java-c

Simplest Possible Java - C Invocation

## Installation

1. Install [GraalVM](https://www.graalvm.org/22.1/docs/getting-started/#install-graalvm)
2. `java -version` should print a GraalVM-related output
3. Install (`gu install [COMPONENT]`) the following GraalVM components: `graalvm`, `llvm`, `llvm-toolchain`, `native-image`
4. Run the [nativebuild.sh](./nativebuild.sh) script
5. Execute the native app with `dist/NativeCalculator`

Also checkout the post: [GraalVM: How To Call C-Function From Java ...with an Annotation](https://adambien.blog/roller/abien/entry/graalvm_how_to_call_c)
