// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditLicenseResponseBody body;

    public static EditLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        EditLicenseResponse self = new EditLicenseResponse();
        return TeaModel.build(map, self);
    }

    public EditLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditLicenseResponse setBody(EditLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public EditLicenseResponseBody getBody() {
        return this.body;
    }

}
