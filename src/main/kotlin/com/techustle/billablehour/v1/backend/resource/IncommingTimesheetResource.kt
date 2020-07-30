package com.techustle.billablehour.v1.backend.resource

import java.util.*

class IncommingTimesheetResource{
    var employeeId:Int = 0
    var rate:String = ""
    var project:String=""
    var date: Date = Date()
    var startTime:String = ""
    var endTime:String = ""
    var total: String = ""
    var hourWorked: Int = 0
    var href: TimesheetLinkResource = TimesheetLinkResource()
}