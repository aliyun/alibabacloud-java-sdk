// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskRequest extends TeaModel {
    /**
     * <p>The end time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. By default, the time range of the task is the latest 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-30T02:10:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The inspection items. Separates multiple items with commas (,). If this parameter is empty or not specified, all inspection items are executed.</p>
     * <h3><a href="#"></a>Valid values:</h3>
     * <ul>
     * <li>instance_info</li>
     * <li>resource_usage</li>
     * <li>connection_session_management</li>
     * <li>performance_metrics</li>
     * <li>slow_query_analysis</li>
     * <li>error_log_analysis</li>
     * <li>lock_wait_deadlock_analysis</li>
     * <li>backup_recovery_analysis</li>
     * <li>high_availability_disaster_recovery_analysis</li>
     * <li>security_configuration_analysis</li>
     * <li>storage_engine_analysis</li>
     * <li>schema_object_analysis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance_info, resource_usage</p>
     */
    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>The instances covered by the task. Separates multiple instance IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>The start time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. By default, the time range of the task is the latest 24 hours.</p>
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

    public CreateInspectionTaskRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateInspectionTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
