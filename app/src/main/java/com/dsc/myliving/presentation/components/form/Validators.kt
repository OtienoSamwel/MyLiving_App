package com.dsc.myliving.presentation.components.form

private const val EMAIL_MESSAGE = "invalid email address"
private const val REQUIRED_MESSAGE = "this field is required"

sealed interface Validators {
    class Email(var message: String = EMAIL_MESSAGE) : Validators
    class MinChars(var limit: Int, var message: String) : Validators
    class MaxChars(var limit: Int, var message: String) : Validators
    class Required(var message: String = REQUIRED_MESSAGE) : Validators
}

