// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationProgressRequest extends TeaModel {
    @NameInMap("rule-id")
    public String ruleId;

    public static GetBucketReplicationProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationProgressRequest self = new GetBucketReplicationProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationProgressRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
