// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketReplicationLocationResponseBody body;

    public static GetBucketReplicationLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationLocationResponse self = new GetBucketReplicationLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketReplicationLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketReplicationLocationResponse setBody(GetBucketReplicationLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketReplicationLocationResponseBody getBody() {
        return this.body;
    }

}
