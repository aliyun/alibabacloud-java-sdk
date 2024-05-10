// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskRequest extends TeaModel {
    /**
     * <p>The value of the object on which the task runs. If you set TaskType to IMAGE_SCAN, set this parameter to the UUID of the image that you want to scan. If you set TaskType to ASSETS_COLLECTION, set this parameter to the UUID of the server whose information you want to collect.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **ASSETS_COLLECTION**: asset information collection task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListUnfinishedOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnfinishedOnceTaskRequest self = new ListUnfinishedOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListUnfinishedOnceTaskRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ListUnfinishedOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
