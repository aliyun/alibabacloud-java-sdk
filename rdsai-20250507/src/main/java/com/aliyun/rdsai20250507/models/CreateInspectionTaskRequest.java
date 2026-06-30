// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskRequest extends TeaModel {
    /**
     * <p>The end of the inspection time range. The time must be in UTC and formatted as YYYY-MM-DDTHH:mm:ssZ. If StartTime and EndTime are not specified, the inspection covers the last 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-30T02:10:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The inspection items to run, separated by commas. If this parameter is omitted, all inspection items are run.</p>
     * <h3>Inspection items</h3>
     * <ul>
     * <li><p><code>instance_info</code> (instance information)</p>
     * </li>
     * <li><p><code>resource_usage</code> (resource usage)</p>
     * </li>
     * <li><p><code>connection_session_management</code> (connection and session management)</p>
     * </li>
     * <li><p><code>performance_metrics</code> (performance metrics)</p>
     * </li>
     * <li><p><code>slow_query_analysis</code> (slow query analysis)</p>
     * </li>
     * <li><p><code>error_log_analysis</code> (error log analysis)</p>
     * </li>
     * <li><p><code>lock_wait_deadlock_analysis</code> (lock wait and deadlock analysis)</p>
     * </li>
     * <li><p><code>backup_recovery_analysis</code> (backup and recovery analysis)</p>
     * </li>
     * <li><p><code>high_availability_disaster_recovery_analysis</code> (high availability and disaster recovery inspection)</p>
     * </li>
     * <li><p><code>security_configuration_analysis</code> (security configuration inspection)</p>
     * </li>
     * <li><p><code>storage_engine_analysis</code> (storage engine inspection)</p>
     * </li>
     * <li><p><code>schema_object_analysis</code> (schema and object inspection)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance_info, resource_usage</p>
     */
    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The IDs of the instances to inspect. Separate multiple instance IDs with a comma.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The language of the inspection report. Valid values are zh-CN (Simplified Chinese) and en-US (English). The default value is en-US.</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    @NameInMap("ReportRegionId")
    public String reportRegionId;

    /**
     * <p>The format of the inspection report. Valid values are pdf and json. The default value is pdf.</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The beginning of the inspection time range. The time must be in UTC and formatted as YYYY-MM-DDTHH:mm:ssZ. If StartTime and EndTime are not specified, the inspection covers the last 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-28T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionTaskRequest self = new CreateInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInspectionTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateInspectionTaskRequest setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems;
        return this;
    }
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    public CreateInspectionTaskRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public CreateInspectionTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInspectionTaskRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateInspectionTaskRequest setReportRegionId(String reportRegionId) {
        this.reportRegionId = reportRegionId;
        return this;
    }
    public String getReportRegionId() {
        return this.reportRegionId;
    }

    public CreateInspectionTaskRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public CreateInspectionTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
