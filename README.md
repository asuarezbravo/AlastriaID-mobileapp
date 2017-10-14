# AlastriaID-mobileapp
Android Studio app for Alastria ID. 
This app will allow users to register, login and join services in Alastria network using their Android mobile phone.

Mockup with main functionality can be found here:  https://app.moqups.com/alvarosb999/a3412PDwVs/view/page/a1452251d

## Architectural Pattern
This app has been implemented using the Model-View-Presenter pattern (MVP). This architectural pattern has 3 players:
 - *Model*: it is an interface responsible for managing data. 
 - *Presenter*: the presenter is the middle-man between model and view. All the presentation logic belongs to it. The presenter is responsible for querying the model and updating the view, reacting to user interactions updating the model.
 - *View*: it is only responsible for presenting data in a way decided by the presenter. 
 
 ## Java and Android Naming Conventions
Readability of Java code is important because it means less time is spent trying to figure out what the code does, leaving more time to fix or modify it. Let's try to adhere to most common Java and Android code and naming conventions. Some basic rules:

| Identifier Type | Rules for Naming | Examples |
| ------ | ------ | ------ |
| Packages | The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981. Subsequent components of the package name vary according to an organization's own internal naming conventions. Such conventions might specify that certain directory name components be division, department, project, machine, or login names. | com.sun.eng |
| Classes | Class names should be nouns, in mixed case with the first letter of each internal word capitalized. Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML). | class Raster; |
| Interfaces | Interface names should be capitalized like class names. | interface RasterDelegate; interface Storing; |
| Methods | Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized. | run(); |
| Variables | Except for variables, all instance, class, and class constants are in mixed case with a lowercase first letter. Internal words start with capital letters. Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed. Variable names should be short yet meaningful. The choice of a variable name should be mnemonic- that is, designed to indicate to the casual observer the intent of its use. One-character variable names should be avoided except for temporary "throwaway" variables. Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters. Android best practices indicates that non-public, non-static field names should start with m; static field names should start with s; and other fields start with a lower case letter.| int i; |
| Constants | The names of variables declared class constants and of ANSI constants should be all uppercase with words separated by underscores ("_"). (ANSI constants should be avoided, for ease of debugging.) | static final int MIN_WIDTH = 4; |

More information can be found here:

 - Java: http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 - Android: https://source.android.com/source/code-style#follow-field-naming-conventions


