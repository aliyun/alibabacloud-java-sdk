// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachRCDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachRCDiskResponseBody body;

    public static DetachRCDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachRCDiskResponse self = new DetachRCDiskResponse();
        return TeaModel.build(map, self);
    }

    public DetachRCDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachRCDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachRCDiskResponse setBody(DetachRCDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachRCDiskResponseBody getBody() {
        return this.body;
    }

}
