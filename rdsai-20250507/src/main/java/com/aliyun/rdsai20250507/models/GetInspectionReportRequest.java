// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetInspectionReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-2zep6e5u6l2yu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9d246af2-a0cd-4f69-857d-3785048f****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetInspectionReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportRequest self = new GetInspectionReportRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInspectionReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
