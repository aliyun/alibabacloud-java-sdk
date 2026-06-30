// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The new description of the inspection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>定时RDS实例巡检任务</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new inspection frequency. Separate multiple values with a comma (,). The default value is DAILY. Valid values:</p>
     * <ul>
     * <li><p>DAILY: Every day</p>
     * </li>
     * <li><p>Monday: Every Monday</p>
     * </li>
     * <li><p>Tuesday: Every Tuesday</p>
     * </li>
     * <li><p>Wednesday: Every Wednesday</p>
     * </li>
     * <li><p>Thursday: Every Thursday</p>
     * </li>
     * <li><p>Friday: Every Friday</p>
     * </li>
     * <li><p>Saturday: Every Saturday</p>
     * </li>
     * <li><p>Sunday: Every Sunday</p>
     * </li>
     * </ul>
     * <h3>Note: <code>DAILY</code> overrides all other day-of-the-week settings. For example, if you specify <code>DAILY,Monday</code>, the system uses <code>DAILY</code> as the inspection frequency.</h3>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The new instance IDs to associate with the task. Separate multiple IDs with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The new name of the inspection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS巡检任务</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>The ID of the scheduled inspection configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    /**
     * <p>The new time to run the inspection task. The time must be in the <code>HH:mm:ssZ</code> format and in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The inspection time range in hours. The default is 24, which means data from the last 24 hours is inspected. Valid values: 1 to 168. The maximum supported range is 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static ModifyScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskRequest self = new ModifyScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyScheduledTaskRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public ModifyScheduledTaskRequest setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems;
        return this;
    }
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    public ModifyScheduledTaskRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyScheduledTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyScheduledTaskRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public ModifyScheduledTaskRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

    public ModifyScheduledTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyScheduledTaskRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
