//
// Created by wak on 2019/12/27.
//
#include "com_example_c_bean_EntryUtils.h"
#include <string>
using namespace std;
const char *DES_KEY = "12345678912345678912345678912345";

JNIEXPORT jstring JNICALL Java_com_example_c_bean_EntryUtils_getStringC
        (JNIEnv * env, jclass){

    string hello = "des加密 From C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring JNICALL Java_com_example_c_bean_EntryUtils_encode
        (JNIEnv * env, jclass, jstring jstr){
    string hello = "Hello World from C++";

    if (jstr == NULL) {
        return NULL;
    }
    jstring key;
    jstring result;
    jclass AESencrypt;
    jmethodID mid;

    AESencrypt = env->FindClass("com/example/c/bean/EntryUtils");
    if (NULL == AESencrypt) {
        return NULL;
    }
    mid = env->GetStaticMethodID(AESencrypt, "encrypy",
                                 "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
    if (NULL == mid) {
        env->DeleteLocalRef(AESencrypt);
        return NULL;
    }
    key = env->NewStringUTF(DES_KEY);
    result =  (jstring)env->CallStaticObjectMethod(AESencrypt, mid, key, jstr);
    env->DeleteLocalRef(AESencrypt);
    env->DeleteLocalRef(key);
    return result;
}

JNIEXPORT jstring JNICALL Java_com_example_c_bean_EntryUtils_decode
        (JNIEnv * env, jclass, jstring jstr){

    string hello = "Hello World from C++";
    return env->NewStringUTF(hello.c_str());
}


