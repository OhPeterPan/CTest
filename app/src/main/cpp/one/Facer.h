#pragma once
#include <iostream>

using namespace std;

class Facer {
public:
	Facer(const string& top = "#", const string& bottom = "#", const string& brow = "~", const string& eyes = ".");
	~Facer();
public:
	string top;
	string bottom;
	string brow;
	string eyes;
public:
	void printFace();
	string getFace();
};
