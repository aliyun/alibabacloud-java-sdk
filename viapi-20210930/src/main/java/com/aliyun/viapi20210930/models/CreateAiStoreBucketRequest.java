// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreBucketRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    public static CreateAiStoreBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreBucketRequest self = new CreateAiStoreBucketRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
