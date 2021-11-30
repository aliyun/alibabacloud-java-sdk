// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketLoggingRequest extends TeaModel {
    @NameInMap("BucketLoggingStatus")
    public BucketLoggingStatus bucketLoggingStatus;

    public static PutBucketLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketLoggingRequest self = new PutBucketLoggingRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketLoggingRequest setBucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
        this.bucketLoggingStatus = bucketLoggingStatus;
        return this;
    }
    public BucketLoggingStatus getBucketLoggingStatus() {
        return this.bucketLoggingStatus;
    }

}
