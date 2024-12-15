Checked Exceptions
Common Causes:	External factors, programming errors
Handling Requirement:	Must be handled or declared
Compil-time errors: The compiler forces you to handle or declare these exceptions.
Common examples: IOException, SQLException, ClassNotFoundException
Why checked? These exceptions usually indicate external factors or programming errors that are beyond the control of the programmer. 
By forcing you to handle them, the compiler ensures that your code is robust and can handle potential issues.


Unchecked Exceptions
Common Causes: programming errors
Handling Requirement:	Not required to be handled
Runtime errors: These exceptions are not checked by the compiler.
Common examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
Why unchecked? These exceptions often result from programming errors, such as accessing an array index out of bounds or dividing by zero. 
The compiler assumes that the programmer will take care to avoid these errors.