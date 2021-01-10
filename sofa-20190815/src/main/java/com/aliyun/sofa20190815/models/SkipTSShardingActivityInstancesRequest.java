// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipTSShardingActivityInstancesRequest extends TeaModel {
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

    public static SkipTSShardingActivityInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipTSShardingActivityInstancesRequest self = new SkipTSShardingActivityInstancesRequest();
        return TeaModel.build(map, self);
    }

    public SkipTSShardingActivityInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SkipTSShardingActivityInstancesRequest setCurSharding(Long curSharding) {
        this.curSharding = curSharding;
        return this;
    }
    public Long getCurSharding() {
        return this.curSharding;
    }

    public SkipTSShardingActivityInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SkipTSShardingActivityInstancesRequest setParentActivityInstanceId(Long parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }
    public Long getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

    public SkipTSShardingActivityInstancesRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
