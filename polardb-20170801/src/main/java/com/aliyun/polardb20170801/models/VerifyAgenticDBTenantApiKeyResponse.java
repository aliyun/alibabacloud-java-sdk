// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class VerifyAgenticDBTenantApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyAgenticDBTenantApiKeyResponseBody body;

    public static VerifyAgenticDBTenantApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgenticDBTenantApiKeyResponse self = new VerifyAgenticDBTenantApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAgenticDBTenantApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAgenticDBTenantApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAgenticDBTenantApiKeyResponse setBody(VerifyAgenticDBTenantApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAgenticDBTenantApiKeyResponseBody getBody() {
        return this.body;
    }

}
