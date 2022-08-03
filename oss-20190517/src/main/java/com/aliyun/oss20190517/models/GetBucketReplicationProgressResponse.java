// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketReplicationProgressResponseBody body;

    public static GetBucketReplicationProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationProgressResponse self = new GetBucketReplicationProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketReplicationProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketReplicationProgressResponse setBody(GetBucketReplicationProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketReplicationProgressResponseBody getBody() {
        return this.body;
    }

}
