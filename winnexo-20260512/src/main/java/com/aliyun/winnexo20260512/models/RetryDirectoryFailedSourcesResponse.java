// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryDirectoryFailedSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryDirectoryFailedSourcesResponseBody body;

    public static RetryDirectoryFailedSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDirectoryFailedSourcesResponse self = new RetryDirectoryFailedSourcesResponse();
        return TeaModel.build(map, self);
    }

    public RetryDirectoryFailedSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDirectoryFailedSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryDirectoryFailedSourcesResponse setBody(RetryDirectoryFailedSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDirectoryFailedSourcesResponseBody getBody() {
        return this.body;
    }

}
