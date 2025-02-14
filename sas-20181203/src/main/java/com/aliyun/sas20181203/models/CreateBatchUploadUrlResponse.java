// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBatchUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchUploadUrlResponseBody body;

    public static CreateBatchUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchUploadUrlResponse self = new CreateBatchUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchUploadUrlResponse setBody(CreateBatchUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchUploadUrlResponseBody getBody() {
        return this.body;
    }

}
