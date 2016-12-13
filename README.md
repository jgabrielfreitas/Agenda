# Agenda
Android agenda view library

###How to
**Step 1.** Add the JitPack repository to your build file
```gradle
allprojects {

    dependencies {
        ...
        classpath 'me.tatarka:gradle-retrolambda:3.1.0'
    }

    repositories {
	...
	maven { url  "http://dl.bintray.com/jgabrielfreitas/maven" }
    }
}
```

**Step 2.** Add the dependency
```gradle
apply plugin: 'me.tatarka.retrolambda'
...

dependencies {
	compile 'com.jgabrielfreitas:agenda:1.0.0'
}
```

###License
```
MIT License

Copyright (c) 2016 João Gabriel de Freitas

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
