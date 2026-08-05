// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description of the scheduled inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled RDS instance inspection task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
     * <ul>
     * <li>DAILY: every day.</li>
     * <li>Monday: Monday.</li>
     * <li>Tuesday: Tuesday.</li>
     * <li>Wednesday: Wednesday.</li>
     * <li>Thursday: Thursday.</li>
     * <li>Friday: Friday.</li>
     * <li>Saturday: Saturday.</li>
     * <li>Sunday: Sunday.</li>
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
     * <p>The list of associated instance IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the scheduled inspection task. The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS Inspection</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The report language. Default value: zh-CN. Valid values: zh-CN, zh-TW, ja-JP, and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    @NameInMap("ReportRegionId")
    public String reportRegionId;

    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The time to run the inspection task. Format: HH:mm:ssZ (UTC). Default value: 02:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The time range for the inspection. Default value: the last 24 hours. Valid values: 1 to 168 (up to 7 days).</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduledTaskRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public CreateScheduledTaskRequest setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems;
        return this;
    }
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    public CreateScheduledTaskRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public CreateScheduledTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScheduledTaskRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateScheduledTaskRequest setReportRegionId(String reportRegionId) {
        this.reportRegionId = reportRegionId;
        return this;
    }
    public String getReportRegionId() {
        return this.reportRegionId;
    }

    public CreateScheduledTaskRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public CreateScheduledTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateScheduledTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateScheduledTaskRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
