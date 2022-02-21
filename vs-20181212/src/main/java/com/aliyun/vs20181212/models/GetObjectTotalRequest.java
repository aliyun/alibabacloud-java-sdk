// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetObjectTotalRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetObjectTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTotalRequest self = new GetObjectTotalRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectTotalRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetObjectTotalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
