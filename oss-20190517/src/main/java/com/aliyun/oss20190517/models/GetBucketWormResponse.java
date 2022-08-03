// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketWormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketWormResponseBody body;

    public static GetBucketWormResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketWormResponse self = new GetBucketWormResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketWormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketWormResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketWormResponse setBody(GetBucketWormResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketWormResponseBody getBody() {
        return this.body;
    }

}
