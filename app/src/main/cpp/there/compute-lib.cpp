#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_c_ui_ComputeActivity_computer(JNIEnv *env, jclass type, jint a, jint b) {

    return a+b;
}
