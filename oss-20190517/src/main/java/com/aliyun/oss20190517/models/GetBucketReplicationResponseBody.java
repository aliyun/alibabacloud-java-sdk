// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationResponseBody extends TeaModel {
    @NameInMap("Rule")
    public java.util.List<ReplicationRule> rules;

    public static GetBucketReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationResponseBody self = new GetBucketReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationResponseBody setRules(java.util.List<ReplicationRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ReplicationRule> getRules() {
        return this.rules;
    }

}
