// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponseBody extends TeaModel {
    @NameInMap("Rule")
    public LifecycleRule rule;

    public static GetBucketLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleResponseBody self = new GetBucketLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleResponseBody setRule(LifecycleRule rule) {
        this.rule = rule;
        return this;
    }
    public LifecycleRule getRule() {
        return this.rule;
    }

}
