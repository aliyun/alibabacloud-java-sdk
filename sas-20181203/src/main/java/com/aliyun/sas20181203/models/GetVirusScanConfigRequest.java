// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVirusScanConfigRequest extends TeaModel {
    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: a virus scan task.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetVirusScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanConfigRequest self = new GetVirusScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetVirusScanConfigRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
