// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RenewFreeLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewFreeLicenseResponseBody body;

    public static RenewFreeLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewFreeLicenseResponse self = new RenewFreeLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RenewFreeLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewFreeLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewFreeLicenseResponse setBody(RenewFreeLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewFreeLicenseResponseBody getBody() {
        return this.body;
    }

}
