// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PrepareUploadRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("ClientIp")
    public String clientIp;

    public static PrepareUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadRequest self = new PrepareUploadRequest();
        return TeaModel.build(map, self);
    }

    public PrepareUploadRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PrepareUploadRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PrepareUploadRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

}
