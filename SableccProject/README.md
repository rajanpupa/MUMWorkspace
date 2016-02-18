## SableCC sample program

First, setup your environment(install SableCC) using the link below

http://web.archive.org/web/20090318023544/http://www.comp.nus.edu.sg/~sethhetu/rooms/Tutorials/EclipseAndSableCC.html

#### Modification.

The grammar in the example has been modified slightly to support multiple additions in the same line.

eg: The example in the above link would work only for two integer input separated by a plus sign.
2 + 3;

The modification will work for multiple integers separated by plus sign.
1 + 2 + 3 + 4;

### Run the program

* Click the .sable file. Run -> External Programs -> SableCC Compiler
* click the project and press f5.
* Right click the MainApp.smpleAdder.Interpreter.java class, Run configurations.
* Enter tester.sa in the Arguments section and then click Apply, Run.