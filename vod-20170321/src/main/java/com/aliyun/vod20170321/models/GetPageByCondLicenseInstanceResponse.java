// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPageByCondLicenseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageByCondLicenseInstanceResponseBody body;

    public static GetPageByCondLicenseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageByCondLicenseInstanceResponse self = new GetPageByCondLicenseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetPageByCondLicenseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageByCondLicenseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageByCondLicenseInstanceResponse setBody(GetPageByCondLicenseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageByCondLicenseInstanceResponseBody getBody() {
        return this.body;
    }

}
