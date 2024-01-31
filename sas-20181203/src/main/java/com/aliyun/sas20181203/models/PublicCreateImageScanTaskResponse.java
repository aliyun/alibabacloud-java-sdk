// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicCreateImageScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublicCreateImageScanTaskResponseBody body;

    public static PublicCreateImageScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PublicCreateImageScanTaskResponse self = new PublicCreateImageScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public PublicCreateImageScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublicCreateImageScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublicCreateImageScanTaskResponse setBody(PublicCreateImageScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PublicCreateImageScanTaskResponseBody getBody() {
        return this.body;
    }

}
