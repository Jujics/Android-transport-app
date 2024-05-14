
cmake_minimum_required(VERSION 3.4.1)
add_library(
        dijktra
        SHARED
        dijktra.cpp)
find_library(
        dijktra
        log)
target_link_libraries(
        dijktra
        ${log-lib})