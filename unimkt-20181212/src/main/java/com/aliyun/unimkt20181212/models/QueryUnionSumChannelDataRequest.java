// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionSumChannelDataRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TaskType")
    public String taskType;

    public static QueryUnionSumChannelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionSumChannelDataRequest self = new QueryUnionSumChannelDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionSumChannelDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryUnionSumChannelDataRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
