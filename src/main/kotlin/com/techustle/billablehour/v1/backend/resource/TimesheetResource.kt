package com.techustle.billablehour.v1.backend.resource

import java.text.SimpleDateFormat
import java.util.*

class TimesheetResource{
    var employeeId:Int = 0
    var amount:Double = 0.0
    var project:String = ""
    var date:Date = Date()
    var startTime:Date = Date()
    var endTime:Date = Date()
    var hourWorked:Int = 0
    var href: TimesheetLinkResource = TimesheetLinkResource()

    fun setStarttime(start_time: String) {
        //set settings
        val sdf = SimpleDateFormat("HH:mm")
        val thresholdDate = sdf.parse(start_time)
        this.startTime = thresholdDate
    }

    fun setEndtime(end_time: String) {
        //set settings
        val sdf = SimpleDateFormat("HH:mm")
        val thresholdDate = sdf.parse(end_time)
        this.endTime = thresholdDate

        //since we have known start and endtime from here, it will be nice
        // if hours difference is encapsulated here

        //calculate the hour difference between start and end time
        var diffInSecond: Long = this.endTime.time - this.startTime.time
        diffInSecond = diffInSecond / 1000
        val diffInMinutes = diffInSecond.toInt() / 60
        val diffInHour = diffInMinutes / 60
        this.hourWorked = diffInHour
    }
}




