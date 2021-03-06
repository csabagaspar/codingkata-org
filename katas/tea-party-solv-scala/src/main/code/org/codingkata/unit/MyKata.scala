package org.codingkata.unit;

import _root_.org.codingkata.unit.api.BaseKataSolution;

class MyKata extends BaseKataSolution {

    override def welcome(name:String, isWoman:Boolean, isSir:Boolean):String = {

        var ret = new String("Hello ")
        if (isWoman) {
            ret += "Ms. ";
        } else if (isSir) {
            ret += "Sir ";
        } else {
            ret += "Mr. ";
        }
        ret + name;
    }
}