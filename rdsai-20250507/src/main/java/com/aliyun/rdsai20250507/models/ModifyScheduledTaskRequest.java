// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description of the new inspection configuration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
     * <ul>
     * <li>DAILY</li>
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday</li>
     * </ul>
     * <h3><a href="#daily--dailymonday--daily-"></a>Note: DAILY takes precedence over other values. For example, if you enter DAILY,Monday, the backend will use DAILY as the inspection frequency.</h3>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The new list of related instances. Separate multiple instances with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the new inspection configuration.</p>
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
     * <p>The new execution time of the inspection task. Specify the time in the ISO 8601 standard in the HH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The inspection time range. The default value is the latest 24 hours. Valid values: 1 to 168. The maximum value is 7 days.</p>
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
