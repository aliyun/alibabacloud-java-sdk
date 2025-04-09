// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class InflightTaskTimeoutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d350e38-f561-49b0-85d3-b90d9fc7e052</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1864632921948620</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6bc0585c-0a8a-46d8-b042-23570bbb4855</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static InflightTaskTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        InflightTaskTimeoutRequest self = new InflightTaskTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public InflightTaskTimeoutRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InflightTaskTimeoutRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public InflightTaskTimeoutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
