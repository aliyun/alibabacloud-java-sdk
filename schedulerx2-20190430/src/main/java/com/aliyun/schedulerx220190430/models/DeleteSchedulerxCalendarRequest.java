// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteSchedulerxCalendarRequest extends TeaModel {
    /**
     * <p>The calendar name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025workday</p>
     */
    @NameInMap("CalendarName")
    public String calendarName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The year.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static DeleteSchedulerxCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerxCalendarRequest self = new DeleteSchedulerxCalendarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerxCalendarRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public DeleteSchedulerxCalendarRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSchedulerxCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
