# IntelliJ/PyCharm/... YANG Modeling Plugin

This is a manual fork of the [IntelliJ YANG plugin](https://github.com/kvakvs/intellij-yang) project
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

# Features

- Syntax Highlighting
- Rudimentary Code Completion

# To Do
Some ideas for improvement.  Not all are easy or possible to realize.

- Settings to allow for color assignments
- Highlight deprecated items
- Formatting rules and reformat code capabilities
  - Indention
  - Spaces before {", "{" on same line or next
  - Spaces before }", "}" on same line or next
  - Maximum line lengths (Descriptions particularly)
  - import optimization (alphabetical)
  - revision optimization (newest first)
- Reference links
  - Indexing phase if needed. Figure out how to parse or look up some well known models
  - Click on import (or import lookup)
  - Typedefs  (goto definition and perhaps tooltip?)
  - Uses, augment, ... (goto the reference on click)

--------------------------------------------------------------------------------------------------------------
Original [README.md](https://github.com/kvakvs/intellij-yang/README.md) and
local copy [README.md](https://github.com/cboling/yang-plugin/.original.README.md)
