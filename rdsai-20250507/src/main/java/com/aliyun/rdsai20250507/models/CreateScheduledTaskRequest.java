// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description of the scheduled inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>定时RDS实例巡检任务</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The inspection frequency. Use commas (,) to separate multiple values. The default is DAILY. Valid values:</p>
     * <ul>
     * <li><p>DAILY: Every day</p>
     * </li>
     * <li><p>Monday: Monday</p>
     * </li>
     * <li><p>Tuesday: Tuesday</p>
     * </li>
     * <li><p>Wednesday: Wednesday</p>
     * </li>
     * <li><p>Thursday: Thursday</p>
     * </li>
     * <li><p>Friday: Friday</p>
     * </li>
     * <li><p>Saturday: Saturday</p>
     * </li>
     * <li><p>Sunday: Sunday</p>
     * </li>
     * </ul>
     * <h3>Note: DAILY overrides weekly values. For example, if you enter DAILY,Monday, the system uses DAILY as the inspection frequency.</h3>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The IDs of the instances for the task. Use commas (,) to separate multiple IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the scheduled inspection task. The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS巡检</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The report language. The default value is zh-CN. Supported values: zh-CN, zh-TW, ja-JP, and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>The ID of the region where the report is stored.</p>
     */
    @NameInMap("ReportRegionId")
    public String reportRegionId;

    /**
     * <p>The type of the report.</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The execution time for the scheduled inspection task. Specify the time in the HH:mm:ssZ format (UTC time). The default is 02:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The time range of data to inspect, in hours. Valid values are from 1 to 168 (7 days). The default is 24.</p>
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

    public CreateScheduledTaskRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
