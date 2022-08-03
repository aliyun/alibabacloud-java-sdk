// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketLoggingResponseBody body;

    public static GetBucketLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLoggingResponse self = new GetBucketLoggingResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketLoggingResponse setBody(GetBucketLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketLoggingResponseBody getBody() {
        return this.body;
    }

}
