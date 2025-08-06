// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppLicenseResponseBody body;

    public static DeleteAppLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLicenseResponse self = new DeleteAppLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppLicenseResponse setBody(DeleteAppLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppLicenseResponseBody getBody() {
        return this.body;
    }

}
