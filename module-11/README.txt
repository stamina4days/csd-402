Prince Hubbard
CSD402 Module 11.2

CONTENTS
Hubbard_Mod11_2_Paper.docx: 700-word paper, excluding title, author details,
and references. No source code is embedded in the paper.
HubbardLayoutDemo.java: Separate documented JavaFX program for both topics.

WINDOWS POWERSHELL SETUP
1. Install a full JDK (17 or later) and JavaFX SDK 21 for Windows matching your
   system architecture. JavaFX SDK 21 works with JDK 17 or later. These
   instructions deliberately use version 21; newer JavaFX versions may require
   newer JDKs. Get the SDK from https://gluonhq.com/products/javafx/ and follow
   official setup guidance at https://openjfx.io/openjfx-docs/.
2. Extract the SDK and locate its lib folder.
3. Open PowerShell in the folder containing HubbardLayoutDemo.java.
4. Set this path to YOUR actual extracted SDK lib folder:
   $fxLib = "C:\javafx-sdk-21\lib"
5. Compile:
   javac --module-path "$fxLib" --add-modules javafx.controls HubbardLayoutDemo.java
6. Run:
   java --module-path "$fxLib" --add-modules javafx.controls HubbardLayoutDemo

MANUAL CHECKS
- Add a task using Add; verify it appears and the entry field clears.
- Add a task by pressing Enter; verify the same behavior.
- Submit an empty or whitespace-only entry; verify the validation message.
- Click Clear; verify the list empties and the status changes.
- Resize the window; the input should grow horizontally and the list vertically.
- Close and reopen; tasks are intentionally not saved between sessions.

SUBMISSION
Read the paper and check the program on your computer. Commit and push the
paper and source to your GitHub repository. Attach the ZIP and paste your
actual GitHub repository URL into the assignment comments.
