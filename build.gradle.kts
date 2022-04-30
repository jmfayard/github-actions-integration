plugins {
    application
}


fun registerDummyTasks(vararg names: String) {
    for (name in names) {
        tasks.register(name) {
            doFirst {
                println("$name: OK")
            }
        }
    }
}

registerDummyTasks(
    "publishToMavenLocal", "refreshVersions"
)