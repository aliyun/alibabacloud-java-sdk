// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SasInstallCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SasInstallCodeResponseBody body;

    public static SasInstallCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SasInstallCodeResponse self = new SasInstallCodeResponse();
        return TeaModel.build(map, self);
    }

    public SasInstallCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SasInstallCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SasInstallCodeResponse setBody(SasInstallCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SasInstallCodeResponseBody getBody() {
        return this.body;
    }

}
