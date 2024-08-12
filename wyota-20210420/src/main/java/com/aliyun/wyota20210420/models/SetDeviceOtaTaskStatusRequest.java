// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SetDeviceOtaTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationStatus")
    public Integer operationStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static SetDeviceOtaTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceOtaTaskStatusRequest self = new SetDeviceOtaTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceOtaTaskStatusRequest setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public Integer getOperationStatus() {
        return this.operationStatus;
    }

    public SetDeviceOtaTaskStatusRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
