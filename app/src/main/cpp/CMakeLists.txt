#1.声明CMake最低版本
cmake_minimum_required(VERSION 3.4.1)
#2.编译出的so库文件，存放的位置
#3.各个子目录的路径


#set(CMAKE_CXX_FLAGS "-Wno-error=format-security -Wno-error=pointer-sign")
# ${PROJECT_SOURCE_DIR}
#set(CMAKE_LIBRARY_OUTPUT_DIRECTORY src/main/jniLibs/${ANDROID_ABI})

#设置头文件搜索路径（和此txt同个路径的头文件无需设置），可选
#INCLUDE_DIRECTORIES(${CMAKE_CURRENT_SOURCE_DIR}/common)

#指定用到的系统库或者NDK库或者第三方库的搜索路径，可选。
#LINK_DIRECTORIES(/usr/local/lib)

#添加子目录，将自动找到子目录中的CMakeLists.txt
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/one)
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/two)
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/there)
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/pwd)
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/four)
ADD_SUBDIRECTORY(${PROJECT_SOURCE_DIR}/bitmap)