# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

set(CMAKE_VERBOSE_MAKEFILE on)
#set(libs "${CMAKE_SOURCE_DIR}/../../../../native/libs")
#添加头文件位置
include_directories(${CMAKE_SOURCE_DIR}/../../../../native/jni/include)
#引入libopencv_java4.so文件
add_library(opencv_java4 SHARED IMPORTED)

set_target_properties(opencv_java4
        PROPERTIES
        # ${PROJECT_SOURCE_DIR}
        # ${CMAKE_CURRENT_SOURCE_DIR}
        # ${CMAKE_SOURCE_DIR}
        IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/../../../../native/libs/${ANDROID_ABI}/libopencv_java3.so
        )

message(STATUS ">>>>>>>>>>>>>>>>>>>>>>IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/../../../../native/libs/${ANDROID_ABI}/libopencv_java3.so")


add_library( # Sets the name of the library.
        blind-mark

        # Sets the library as a shared library.
        SHARED

       floor-lib.cpp
        )


# 支持操作Bitmap的库
find_library( # Sets the name of the path variable.
        jnigraphics-lib
        # Specifies the name of the NDK library that
        # you want CMake to locate.
        jnigraphics )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
        blind-mark
        opencv_java4

        # Links the target library to the log library
        # included in the NDK.
        ${jnigraphics-lib}
        ${log-lib}
        )