package com.company;

class F {
    float x, y;


    F() {

    }


    F(float x) {
        this.x = x;   //x ინიციალიზაცია
    }

    F(float x, float y){ // x & y ინიციალიზაცია
    this.x = x;
    this.y = y;
    }

    float Method1(float x, float y){
        if (y == 0){
            return x;
        }
        return Method1(y, x % y);
    }
}