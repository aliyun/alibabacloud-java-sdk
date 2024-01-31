// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileDetectUploadUrlResponseBody body;

    public static CreateFileDetectUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectUploadUrlResponse self = new CreateFileDetectUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileDetectUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileDetectUploadUrlResponse setBody(CreateFileDetectUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileDetectUploadUrlResponseBody getBody() {
        return this.body;
    }

}
