#继承上一层的CMakeLists.txt的变量，也可以在这里重新赋值
#C 的编译选项是 CMAKE_C_FLAGS
# 指定编译参数，可选
#SET(CMAKE_CXX_FLAGS "-Wno-error=format-security -Wno-error=pointer-sign")

#生成动态库名称、类型、资源文件
add_library(compute-lib SHARED compute-lib.cpp)
#依赖库
find_library(log-lib log)
#
target_link_libraries(compute-lib ${log-lib})

# 下面是加载文件中全部文件的操作
#定义全局 my_source_path 变量
#file(GLOB my_source_path
#        ${CMAKE_SOURCE_DIR}/*.cpp
#        ${CMAKE_SOURCE_DIR}/*.c)

#add_library(toly_facer-lib
#        SHARED ${my_source_path})

#find_library(log-lib log)

#target_link_libraries(toly_facer-lib ${log-lib})