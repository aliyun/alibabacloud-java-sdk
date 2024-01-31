// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssBucketScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOssBucketScanTaskResponseBody body;

    public static CreateOssBucketScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOssBucketScanTaskResponse self = new CreateOssBucketScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOssBucketScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOssBucketScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOssBucketScanTaskResponse setBody(CreateOssBucketScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOssBucketScanTaskResponseBody getBody() {
        return this.body;
    }

}
