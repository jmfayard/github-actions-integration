#!/usr/bin/env kotlin

import java.io.File

print(File(".github/workflows/some_workflow.yaml").readText())