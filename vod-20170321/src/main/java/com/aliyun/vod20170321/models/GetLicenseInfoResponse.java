// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLicenseInfoResponseBody body;

    public static GetLicenseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseInfoResponse self = new GetLicenseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLicenseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicenseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLicenseInfoResponse setBody(GetLicenseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicenseInfoResponseBody getBody() {
        return this.body;
    }

}
