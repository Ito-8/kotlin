// WITH_RUNTIME
fun test(i: UByte) {
    <!UNUSED_VARIABLE!>val foo = i.<!REDUNDANT_CALL_OF_CONVERSION_METHOD!>toUByte()<!><!>
}