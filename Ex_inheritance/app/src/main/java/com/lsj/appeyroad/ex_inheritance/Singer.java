package com.lsj.appeyroad.ex_inheritance;

/**
 * Created by lsj on 16. 5. 14.
 */
class Singer {

    protected String name;
    protected int age;

    Singer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String printText() {
        return "가수 추가됨: " + this.name + ", 가수의 나이: " + this.age;
    }
}
