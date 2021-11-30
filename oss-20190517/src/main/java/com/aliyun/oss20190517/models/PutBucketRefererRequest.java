// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketRefererRequest extends TeaModel {
    @NameInMap("RefererConfiguration")
    public RefererConfiguration refererConfiguration;

    public static PutBucketRefererRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRefererRequest self = new PutBucketRefererRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketRefererRequest setRefererConfiguration(RefererConfiguration refererConfiguration) {
        this.refererConfiguration = refererConfiguration;
        return this;
    }
    public RefererConfiguration getRefererConfiguration() {
        return this.refererConfiguration;
    }

}
