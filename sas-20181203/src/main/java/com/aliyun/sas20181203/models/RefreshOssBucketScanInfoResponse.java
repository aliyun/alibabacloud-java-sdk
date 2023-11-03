// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshOssBucketScanInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshOssBucketScanInfoResponseBody body;

    public static RefreshOssBucketScanInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshOssBucketScanInfoResponse self = new RefreshOssBucketScanInfoResponse();
        return TeaModel.build(map, self);
    }

    public RefreshOssBucketScanInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshOssBucketScanInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshOssBucketScanInfoResponse setBody(RefreshOssBucketScanInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshOssBucketScanInfoResponseBody getBody() {
        return this.body;
    }

}
