package com.github.vinitkumar.siturunnathemeintellij.services

import com.intellij.openapi.project.Project
import com.github.vinitkumar.siturunnathemeintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
