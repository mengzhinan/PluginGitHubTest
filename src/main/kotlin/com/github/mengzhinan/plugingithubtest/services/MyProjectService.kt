package com.github.mengzhinan.plugingithubtest.services

import com.intellij.openapi.project.Project
import com.github.mengzhinan.plugingithubtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
        println("test")
    }
}
