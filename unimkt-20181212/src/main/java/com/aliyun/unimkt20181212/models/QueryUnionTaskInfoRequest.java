// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionTaskInfoRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    @NameInMap("TaskId")
    public Long taskId;

    public static QueryUnionTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionTaskInfoRequest self = new QueryUnionTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionTaskInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryUnionTaskInfoRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryUnionTaskInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
