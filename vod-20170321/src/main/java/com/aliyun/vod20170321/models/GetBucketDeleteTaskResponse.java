// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetBucketDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBucketDeleteTaskResponseBody body;

    public static GetBucketDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketDeleteTaskResponse self = new GetBucketDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketDeleteTaskResponse setBody(GetBucketDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
