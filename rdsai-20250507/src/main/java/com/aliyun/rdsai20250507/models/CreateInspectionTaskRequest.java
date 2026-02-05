// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-01-30T02:10:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>instance_info, resource_usage</p>
     */
    @NameInMap("InspectionItems")
    public String inspectionItems;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
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

    public CreateInspectionTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
