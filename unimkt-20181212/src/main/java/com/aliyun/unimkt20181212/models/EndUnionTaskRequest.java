// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class EndUnionTaskRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    @NameInMap("TaskId")
    public Long taskId;

    public static EndUnionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EndUnionTaskRequest self = new EndUnionTaskRequest();
        return TeaModel.build(map, self);
    }

    public EndUnionTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public EndUnionTaskRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public EndUnionTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
