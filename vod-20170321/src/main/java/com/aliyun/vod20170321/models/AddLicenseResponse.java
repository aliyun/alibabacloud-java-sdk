// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLicenseResponseBody body;

    public static AddLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLicenseResponse self = new AddLicenseResponse();
        return TeaModel.build(map, self);
    }

    public AddLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLicenseResponse setBody(AddLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLicenseResponseBody getBody() {
        return this.body;
    }

}
