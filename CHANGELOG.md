<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# yang-plugin Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## [0.0.7] - 2023-04-03
### Added

### Changed
- Added changeNote action back in was failing due to old Gradle version and one old intellij library
- Cleanup of readme and author address


## [0.0.6] - 2023-03-31
### Changed
- Commented out changeNote action since failing.  Will add back later


## [0.0.5] - 2023-03-31
### Added
- 'leaf-list' statement to list of code-folding items
- Some TODO/wish-list items to README.md
- 'grouping' statement to list of code-folding items


## [0.0.4] - 2023-03-31
### Added
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
- Imported original source from [IntelliJ YANG plugin](https://github.com/kvakvs/intellij-yang)
- Added additional YANG keywords/statements (list, rpc, notification) to list of code-folding items


<!-- The following are future/wish-list features -->
## [Unreleased]
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