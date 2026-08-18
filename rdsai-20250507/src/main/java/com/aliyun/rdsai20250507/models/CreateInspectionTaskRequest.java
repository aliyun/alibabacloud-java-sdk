// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskRequest extends TeaModel {
    /**
     * <p>The end time of the inspection range. Format: YYYY-MM-DDTHH:mm:ssZ (UTC). Default value: the end time of the last 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-30T02:10:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of inspection items. Separate multiple values with commas (,). If this parameter is left empty or not specified, all inspection items are executed.</p>
     * <h3>Available inspection items:</h3>
     * <ul>
     * <li>instance_info (instance information)</li>
     * <li>resource_usage (resource usage)</li>
     * <li>connection_session_management (connection and session management)</li>
     * <li>performance_metrics (performance metrics)</li>
     * <li>slow_query_analysis (slow query analysis)</li>
     * <li>error_log_analysis (error log analysis)</li>
     * <li>lock_wait_deadlock_analysis (lock wait and deadlock analysis)</li>
     * <li>backup_recovery_analysis (backup and recovery analysis)</li>
     * <li>high_availability_disaster_recovery_analysis (high availability and disaster recovery inspection)</li>
     * <li>security_configuration_analysis (security configuration inspection)</li>
     * <li>storage_engine_analysis (storage engine inspection)</li>
     * <li>schema_object_analysis (schema and object inspection)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance_info, resource_usage</p>
     */
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

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReportLanguage")
    public String reportLanguage;

    @NameInMap("ReportRegionId")
    public String reportRegionId;

    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The start time of the inspection range. Format: YYYY-MM-DDTHH:mm:ssZ (UTC). Default value: the start time of the last 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-28T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TemplateId")
    public String templateId;

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

    public CreateInspectionTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
