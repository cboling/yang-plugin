# IntelliJ/PyCharm/... YANG Modeling Plugin

This is a fork of the [IntelliJ YANG plugin](https://github.com/kvakvs/intellij-yang) project
that is updated for the latest Jetbrains IDEs (latest as of March 2023).  Goal is to be able to use them
with the newer IDEs and remove restrictions on versions.

**NOTE**: Versions prior to the 2023 is not guaranteed to work...


The first few builds/releases may contain additional IntelliJ template artifacts that are not
needed and it may be a while before I clean them up once I get this project working on my
PyCharm IDE  (Version 2023.1 Professional Edition - Build #PY-231.8109.197, built on March 29, 2023)

<!-- Plugin description -->
This IntelliJ Plugin adds support for Yang Data Modeling Language version 2.0 for the definition of data sent
over the network by NETCONF, RESTCONF management protocols and such. Yang is described in RFC-6020
(version 1.0, 2010) and RFC-7950 (version 1.1, 2016). See https://en.wikipedia.org/wiki/YANG

The plugin adds syntax highlighting for Yang 1.0 and simple code completion.
<!-- Plugin description end -->

--------------------------------------------------------------------------------------------------------------
ORIGINAL README.md is below (from the fork)

intellij-yang
=============

This IntelliJ Plugin adds support for Yang Data Modeling Language for the definition of data sent over the network by NETCONF,
RESTCONF management protocols and such. Yang is described in RFC-6020 (version 1.0, 2010) and RFC-7950 (version 1.1, 2016).
See https://en.wikipedia.org/wiki/YANG

# Features

- Syntax Highlighting
- Rudimentary Code Completion

# To Do

- More comprehensive parsing and code completion
- References
- Find Usages
- Add tests

# Hacking

- Fork this repository
- Make changes
- Send a pull request

# Development Environment

Follow the tutorial [here](http://confluence.jetbrains.com/display/IntelliJIDEA/Prerequisites) to get set up

# License

    Copyright 2014 Red Hat Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.