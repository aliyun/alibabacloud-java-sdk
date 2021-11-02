// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryContentListRequest extends TeaModel {
    @NameInMap("BrandUserId")
    public Long brandUserId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    @NameInMap("TaskBizType")
    public String taskBizType;

    @NameInMap("TaskType")
    public String taskType;

    public static QueryContentListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentListRequest self = new QueryContentListRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentListRequest setBrandUserId(Long brandUserId) {
        this.brandUserId = brandUserId;
        return this;
    }
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    public QueryContentListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryContentListRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryContentListRequest setTaskBizType(String taskBizType) {
        this.taskBizType = taskBizType;
        return this;
    }
    public String getTaskBizType() {
        return this.taskBizType;
    }

    public QueryContentListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
