package com.erdemtsynduev.simplecalculator.operation

import com.erdemtsynduev.simplecalculator.operation.base.BinaryOperation
import com.erdemtsynduev.simplecalculator.operation.base.Operation

class MinusOperation(baseValue: Double, secondValue: Double) :
    BinaryOperation(baseValue, secondValue),
    Operation {

    override fun getResult() = baseValue - secondValue
}
