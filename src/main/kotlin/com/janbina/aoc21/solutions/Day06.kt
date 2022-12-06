package com.janbina.aoc20.solutions

import com.janbina.aoc20.utils.Input

fun main() {
    val input = Input.getDayInputLines(6)
    Day06(input).also {
        println(it.part1())
        println(it.part2())
    }
}

class Day06(
    private val inputLines: List<String>
) {

    private val inputInts by lazy { inputLines.map { it.toInt() } }
    private val inputLinesSplitted by lazy {
        inputLines.map {
            it.split(",")
        }
    }

    fun part1(): Any {

        var result = 0
        var letters = 1
        var this4 = mutableListOf<Char>()
        val line = inputLines[0]
//        if (result != 0) {
//            line.forEach {
//                this4.add(it)
//                if (this4.size == 4) {
//                    var str = ""
//                    this4.forEach {
//                        if (str.contains(it)) {
//                            result = letters
//                        } else {
//                            str += it
//                        }
//                        letters++
//                    }
//
//
//                    this4 = mutableListOf()
//                }
//            }
//        }
        val fours= mutableListOf<String>()

        line.forEach {
            if (fours.isNotEmpty()){
            if (fours[fours.lastIndex].length>=4){
                fours.add(it.toString())
            }else{
                fours.set(fours.lastIndex,fours[fours.lastIndex]+it)
            }
        }else{
                fours.add(it.toString())
        }
        }
        fours.forEach {
            if (result<=0) {
                if (it.toSet().toList().toString().length < 4) {
                    result = letters
                }
            }
            letters+=4
        }

        return result
    }

    fun part2(): Any {

        return 0
    }
}