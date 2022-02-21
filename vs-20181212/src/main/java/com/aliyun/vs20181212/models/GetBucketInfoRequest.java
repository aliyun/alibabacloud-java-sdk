// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetBucketInfoRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetBucketInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoRequest self = new GetBucketInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetBucketInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
