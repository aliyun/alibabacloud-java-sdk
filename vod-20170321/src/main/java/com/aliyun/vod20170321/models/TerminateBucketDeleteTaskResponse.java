// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class TerminateBucketDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateBucketDeleteTaskResponseBody body;

    public static TerminateBucketDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateBucketDeleteTaskResponse self = new TerminateBucketDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public TerminateBucketDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateBucketDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateBucketDeleteTaskResponse setBody(TerminateBucketDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateBucketDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
