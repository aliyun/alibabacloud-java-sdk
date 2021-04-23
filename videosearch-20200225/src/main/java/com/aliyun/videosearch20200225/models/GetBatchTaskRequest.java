// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetBatchTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("BatchTaskId")
    @Validation(required = true)
    public Long batchTaskId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static GetBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskRequest self = new GetBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBatchTaskRequest setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public Long getBatchTaskId() {
        return this.batchTaskId;
    }

    public GetBatchTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
