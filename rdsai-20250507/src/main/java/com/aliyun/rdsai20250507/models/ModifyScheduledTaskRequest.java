// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The new description of the inspection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled RDS instance inspection task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
     * <ul>
     * <li>DAILY: every day</li>
     * <li>Monday: Monday</li>
     * <li>Tuesday: Tuesday</li>
     * <li>Wednesday: Wednesday</li>
     * <li>Thursday: Thursday</li>
     * <li>Friday: Friday</li>
     * <li>Saturday: Saturday</li>
     * <li>Sunday: Sunday</li>
     * </ul>
     * <h3>Note: DAILY overrides weekly values. For example, if you specify DAILY,Monday, the backend uses DAILY as the inspection frequency.</h3>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The new list of associated instance IDs. Separate multiple values with commas (,).</p>
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
     * <p>RDS inspection task</p>
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
     * <p>The new time to execute the inspection task. Format: HH:mm:ssZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The inspection time range. Default value: the last 24 hours. Valid values: 1 to 168 (up to 7 days).</p>
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

    public ModifyScheduledTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyScheduledTaskRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
