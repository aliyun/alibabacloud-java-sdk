// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponseBody extends TeaModel {
    @NameInMap("Rule")
    public java.util.List<LifecycleRule> rules;

    public static GetBucketLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleResponseBody self = new GetBucketLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleResponseBody setRules(java.util.List<LifecycleRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<LifecycleRule> getRules() {
        return this.rules;
    }

}
