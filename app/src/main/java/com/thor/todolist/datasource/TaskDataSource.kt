package com.thor.todolist.datasource

import com.thor.todolist.model.Task

object TaskDataSource {
    fun insertTask(task: Task) {
        if(task.id == 0){
            list.add(task.copy(id = list.size + 1))
        } else{
            list.remove(task)
            list.add(task)
        }

    }

    fun getList () = list.toList()

    fun findById(taskId: Int) = list.find{it.id == taskId}
    
    fun deleteTask(task: Task) {
        list.remove(task)

    }


    private val list = arrayListOf<Task>()

}