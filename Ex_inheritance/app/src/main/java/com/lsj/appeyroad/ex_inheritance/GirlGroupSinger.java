package com.lsj.appeyroad.ex_inheritance;

/**
 * Created by lsj on 16. 5. 14.
 */
class GirlGroupSinger extends Singer{

    GirlGroupSinger(String name, int age) {
        super(name, age);
    }

    @Override
    String printText() {
        return "걸그룹 추가됨: " + this.name + ", 걸그룹의 나이: " + this.age;
    }
}
