// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicPreCheckImageScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublicPreCheckImageScanTaskResponseBody body;

    public static PublicPreCheckImageScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PublicPreCheckImageScanTaskResponse self = new PublicPreCheckImageScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public PublicPreCheckImageScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublicPreCheckImageScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublicPreCheckImageScanTaskResponse setBody(PublicPreCheckImageScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PublicPreCheckImageScanTaskResponseBody getBody() {
        return this.body;
    }

}
