// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadVideoResponseBody body;

    public static CreateUploadVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoResponse self = new CreateUploadVideoResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadVideoResponse setBody(CreateUploadVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadVideoResponseBody getBody() {
        return this.body;
    }

}
