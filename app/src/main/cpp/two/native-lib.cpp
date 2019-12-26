#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_c_ui_HelloActivity_stringFromJni(
        JNIEnv* env,
        jclass type) {
    std::string hello = "Hello World from C++";
    return env->NewStringUTF(hello.c_str());
}
