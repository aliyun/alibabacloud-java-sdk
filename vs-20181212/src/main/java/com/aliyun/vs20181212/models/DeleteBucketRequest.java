// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteBucketRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketRequest self = new DeleteBucketRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DeleteBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
