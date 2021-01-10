// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSShardingActivityInstancesRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("CurSharding")
    public Long curSharding;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ParentActivityInstanceId")
    public Long parentActivityInstanceId;

    @NameInMap("Timeout")
    public Long timeout;

    public static RetryTSShardingActivityInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTSShardingActivityInstancesRequest self = new RetryTSShardingActivityInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RetryTSShardingActivityInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RetryTSShardingActivityInstancesRequest setCurSharding(Long curSharding) {
        this.curSharding = curSharding;
        return this;
    }
    public Long getCurSharding() {
        return this.curSharding;
    }

    public RetryTSShardingActivityInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryTSShardingActivityInstancesRequest setParentActivityInstanceId(Long parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }
    public Long getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

    public RetryTSShardingActivityInstancesRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
