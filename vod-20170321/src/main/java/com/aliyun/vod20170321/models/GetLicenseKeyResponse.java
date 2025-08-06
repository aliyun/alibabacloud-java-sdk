// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLicenseKeyResponseBody body;

    public static GetLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyResponse self = new GetLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicenseKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLicenseKeyResponse setBody(GetLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
