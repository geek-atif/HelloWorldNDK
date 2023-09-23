#include <jni.h>
#include <string>
#include <iostream>

std::string getString() {
    std::string myString = "Hello, World! from C++ by NDK";
    return myString;
}

/*
 * com_atifqamar_helloworldndk : it is package name of project
 * MainActivity : Activity where it will called
 * helloWorld : Method name which we call from Activity
 */
extern "C" JNIEXPORT jstring JNICALL Java_com_atifqamar_helloworldndk_MainActivity_helloWorld(JNIEnv* env,
        jobject mainActivity) {
    return env->NewStringUTF(getString().c_str());
}




