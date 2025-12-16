// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxCalendarRequest extends TeaModel {
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
     * <p>Specifies whether to perform an incremental update. Default value: false.</p>
     * <ul>
     * <li>false: Updates the specified months and removes configurations for all other months.</li>
     * <li>true: Updates only the specified months and preserves existing configurations for other months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Incremental")
    public Boolean incremental;

    /**
     * <p>The month and days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},
     *   {&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},
     *   {&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
     *   {&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},
     *   {&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},
     *   {&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},
     *   {&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
     *   {&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
     *   {&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},
     *   {&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},
     *   {&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},
     *   {&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}
     * ]</p>
     */
    @NameInMap("MonthDaysContent")
    public String monthDaysContent;

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

    public static ManageSchedulerxCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxCalendarRequest self = new ManageSchedulerxCalendarRequest();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxCalendarRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public ManageSchedulerxCalendarRequest setIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }
    public Boolean getIncremental() {
        return this.incremental;
    }

    public ManageSchedulerxCalendarRequest setMonthDaysContent(String monthDaysContent) {
        this.monthDaysContent = monthDaysContent;
        return this;
    }
    public String getMonthDaysContent() {
        return this.monthDaysContent;
    }

    public ManageSchedulerxCalendarRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ManageSchedulerxCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
