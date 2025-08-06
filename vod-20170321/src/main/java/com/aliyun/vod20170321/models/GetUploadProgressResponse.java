// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadProgressResponseBody body;

    public static GetUploadProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadProgressResponse self = new GetUploadProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadProgressResponse setBody(GetUploadProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadProgressResponseBody getBody() {
        return this.body;
    }

}
