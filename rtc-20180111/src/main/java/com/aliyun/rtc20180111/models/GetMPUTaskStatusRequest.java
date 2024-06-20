// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class GetMPUTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetMPUTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMPUTaskStatusRequest self = new GetMPUTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMPUTaskStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMPUTaskStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetMPUTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
