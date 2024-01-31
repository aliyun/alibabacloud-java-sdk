// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOssBucketScanInfoResponseBody body;

    public static ListOssBucketScanInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketScanInfoResponse self = new ListOssBucketScanInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListOssBucketScanInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssBucketScanInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOssBucketScanInfoResponse setBody(ListOssBucketScanInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssBucketScanInfoResponseBody getBody() {
        return this.body;
    }

}
