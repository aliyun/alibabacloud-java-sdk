// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    @NameInMap("CreateBucketConfiguration")
    public CreateBucketConfiguration createBucketConfiguration;

    public static PutBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRequest self = new PutBucketRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketRequest setCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
        this.createBucketConfiguration = createBucketConfiguration;
        return this;
    }
    public CreateBucketConfiguration getCreateBucketConfiguration() {
        return this.createBucketConfiguration;
    }

}
