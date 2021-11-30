// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationProgressResponseBody extends TeaModel {
    @NameInMap("Rule")
    public ReplicationRuleProgress rule;

    public static GetBucketReplicationProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationProgressResponseBody self = new GetBucketReplicationProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationProgressResponseBody setRule(ReplicationRuleProgress rule) {
        this.rule = rule;
        return this;
    }
    public ReplicationRuleProgress getRule() {
        return this.rule;
    }

}
