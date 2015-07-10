# component-example

Example project that aims to show how [component](https://github.com/stuartsierra/component) library works and how use a workflow that let you change code and avoid the JVM reloading.

For further knowledge see this [post](http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded).

The example is just an API that exposes one endpoint to do additions. 


## Installation

Just download or clone it.


## Usage

On your console:

    $ lein repl
    
    user=> (go)

On other console:
    
    $ curl http://localhost:8080/math/sum --data "value1=1&value2=2"
    
Now you can change the code to create a new endpoint on the API in order to do substractions:

- Just change to the prepared branch:

        $ git checkout math-sub-endpoint
    
- Now you can load your modifications in the REPL:

        user=> (reset)
    
- On your second console:
    
        $ curl http://localhost:8080/math/sub --data "value1=1&value2=2" 


## Slides

[Slides](http://www.slideshare.net/jllonch/component-library)


## License

The MIT License (MIT)

Copyright (c) 2015

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
