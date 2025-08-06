// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RenewAppLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAppLicenseResponseBody body;

    public static RenewAppLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAppLicenseResponse self = new RenewAppLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RenewAppLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAppLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAppLicenseResponse setBody(RenewAppLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAppLicenseResponseBody getBody() {
        return this.body;
    }

}
