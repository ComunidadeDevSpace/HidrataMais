package com.joselaine.hidratamais

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotificationWorker(appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {
    override fun doWork(): Result {
        for (i in 0 until 10000) {
            println("Realizando tarefa $i")
        }
        return Result.success()
    }
}