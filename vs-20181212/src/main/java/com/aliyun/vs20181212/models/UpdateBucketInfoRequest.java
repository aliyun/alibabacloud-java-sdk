// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateBucketInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Comment")
    public String comment;

    public static UpdateBucketInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBucketInfoRequest self = new UpdateBucketInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBucketInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateBucketInfoRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public UpdateBucketInfoRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
