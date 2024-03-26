// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadAttachedMediaResponseBody body;

    public static CreateUploadAttachedMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaResponse self = new CreateUploadAttachedMediaResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadAttachedMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadAttachedMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadAttachedMediaResponse setBody(CreateUploadAttachedMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadAttachedMediaResponseBody getBody() {
        return this.body;
    }

}
