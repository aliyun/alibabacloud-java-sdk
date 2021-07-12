// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PrepareUploadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Endpoint")
    public String endpoint;

    public static PrepareUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadResponseBody self = new PrepareUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepareUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrepareUploadResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PrepareUploadResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
