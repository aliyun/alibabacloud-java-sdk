// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketRefererResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static PutBucketRefererResponse build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRefererResponse self = new PutBucketRefererResponse();
        return TeaModel.build(map, self);
    }

    public PutBucketRefererResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
