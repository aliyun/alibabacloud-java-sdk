// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketPolicyRequest extends TeaModel {
    @NameInMap("body")
    public String policy;

    public static PutBucketPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketPolicyRequest self = new PutBucketPolicyRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

}
