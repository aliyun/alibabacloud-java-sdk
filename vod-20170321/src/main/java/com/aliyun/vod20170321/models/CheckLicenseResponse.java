// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CheckLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLicenseResponseBody body;

    public static CheckLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLicenseResponse self = new CheckLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CheckLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLicenseResponse setBody(CheckLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLicenseResponseBody getBody() {
        return this.body;
    }

}
