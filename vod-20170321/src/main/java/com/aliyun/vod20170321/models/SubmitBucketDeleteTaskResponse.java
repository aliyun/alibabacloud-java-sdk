// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitBucketDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBucketDeleteTaskResponseBody body;

    public static SubmitBucketDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBucketDeleteTaskResponse self = new SubmitBucketDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBucketDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBucketDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBucketDeleteTaskResponse setBody(SubmitBucketDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBucketDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
