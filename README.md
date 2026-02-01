Java in VS Code — quick start

Overview
- This sample contains a small Java program at `src/com/example/Main.java` and VS Code launch/tasks configs to run and debug it.

1) Install a JDK (Windows)
- Recommended: Eclipse Temurin (LTS). Using Chocolatey (PowerShell as Admin):

```powershell
choco install temurin17 -y
```

- Or download an installer from the vendor and run it.
- After install, confirm with:

```powershell
java -version
javac -version
```

2) Install VS Code Java extensions
- Recommended extensions (Extension Pack for Java includes many):

```powershell
code --install-extension vscjava.vscode-java-pack
code --install-extension redhat.java
code --install-extension vscjava.vscode-java-debug
code --install-extension vscjava.vscode-maven
code --install-extension vscjava.vscode-java-test
```

3) Open the folder in VS Code
- `File → Open Folder...` and choose this project root (the folder containing `src/`).

4) Build and run
- Build from terminal:

```powershell
mkdir bin
javac -d bin src/com/example/Main.java
java -cp bin com.example.Main
```

- Or use the build task: `Ctrl+Shift+B` (configured in `.vscode/tasks.json`).

5) Debugging basics (in VS Code)
- Start debug session: open `Run` view and choose `Debug (Launch) - Main`, then press `F5`.
- Set a breakpoint: click in the left gutter next to a line.
- Conditional breakpoint: right-click a breakpoint > `Edit Breakpoint...` and enter a condition (e.g. `i == 7`).
- Step controls: `F11` = Step Into, `F10` = Step Over, `Shift+F11` = Step Out, `F5` = Continue.
- Inspect variables: hover over variables in the editor, or open the `Variables` pane in the Run view.
- Watches: right-click an expression > `Add to Watch`, or use the `Watch` pane.
- Evaluate expressions: use the `Debug Console` or the `Evaluate` action in the Variables pane.
- Call stack: check the `Call Stack` pane to inspect frames and navigate to source.
- Exception breakpoints: open `Breakpoints` pane > add Java exception breakpoints to stop on thrown exceptions.

6) Example debugging workflow for this sample
- Set a breakpoint on the `if (i == 7)` print line and make it conditional with `i == 7`.
- Start debug (`F5`). The debugger will stop when `i` equals 7.
- Use `F11` to step into `compute()` if you want to inspect it when invoked.

7) Need help?
- I can guide you through installing the JDK and extensions on your machine step-by-step.
