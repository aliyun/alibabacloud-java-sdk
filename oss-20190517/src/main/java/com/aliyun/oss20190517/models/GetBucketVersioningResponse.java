// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketVersioningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketVersioningResponseBody body;

    public static GetBucketVersioningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketVersioningResponse self = new GetBucketVersioningResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketVersioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketVersioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketVersioningResponse setBody(GetBucketVersioningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketVersioningResponseBody getBody() {
        return this.body;
    }

}
