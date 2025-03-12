// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstallCodeForUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstallCodeForUuidResponseBody body;

    public static GetInstallCodeForUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstallCodeForUuidResponse self = new GetInstallCodeForUuidResponse();
        return TeaModel.build(map, self);
    }

    public GetInstallCodeForUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstallCodeForUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstallCodeForUuidResponse setBody(GetInstallCodeForUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstallCodeForUuidResponseBody getBody() {
        return this.body;
    }

}
