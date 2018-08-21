@file:Suppress("EXPERIMENTAL_API_USAGE_ERROR")
package com.github.czyzby.example.common

@OptionalExpectation
expect annotation class Optional(val value: String)

@Optional("Foo")
class Foo
