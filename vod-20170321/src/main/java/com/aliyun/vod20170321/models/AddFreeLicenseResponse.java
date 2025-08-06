// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFreeLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFreeLicenseResponseBody body;

    public static AddFreeLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFreeLicenseResponse self = new AddFreeLicenseResponse();
        return TeaModel.build(map, self);
    }

    public AddFreeLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFreeLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFreeLicenseResponse setBody(AddFreeLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFreeLicenseResponseBody getBody() {
        return this.body;
    }

}
