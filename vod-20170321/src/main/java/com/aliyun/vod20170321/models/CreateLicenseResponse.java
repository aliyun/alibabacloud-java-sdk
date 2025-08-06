// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLicenseResponseBody body;

    public static CreateLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLicenseResponse self = new CreateLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLicenseResponse setBody(CreateLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLicenseResponseBody getBody() {
        return this.body;
    }

}
