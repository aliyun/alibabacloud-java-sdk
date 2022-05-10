// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublicSyncAndCreateImageScanTaskResponseBody body;

    public static PublicSyncAndCreateImageScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PublicSyncAndCreateImageScanTaskResponse self = new PublicSyncAndCreateImageScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public PublicSyncAndCreateImageScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublicSyncAndCreateImageScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublicSyncAndCreateImageScanTaskResponse setBody(PublicSyncAndCreateImageScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PublicSyncAndCreateImageScanTaskResponseBody getBody() {
        return this.body;
    }

}
