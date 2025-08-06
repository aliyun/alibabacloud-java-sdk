// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelFreeLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelFreeLicenseResponseBody body;

    public static DelFreeLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DelFreeLicenseResponse self = new DelFreeLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DelFreeLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelFreeLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelFreeLicenseResponse setBody(DelFreeLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DelFreeLicenseResponseBody getBody() {
        return this.body;
    }

}
