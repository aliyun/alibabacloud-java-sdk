// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopMPUTaskRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID can be passed.</p>
     * <blockquote>
     * <p>You can create and query the application ID in the <a href="https://rtc.console.aliyun.com/manage/list#/manage/list">console</a>.</p>
     * </blockquote>
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
     * <p>The task ID. Only a single ID can be passed. The value must be the same as the TaskId parameter of <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMPUTaskRequest self = new StopMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopMPUTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
