package com.github.ingridmarcal.intellijplugin.services

import com.github.ingridmarcal.intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
