// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAgenticDBTenantApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAgenticDBTenantApiKeyResponseBody body;

    public static ResetAgenticDBTenantApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticDBTenantApiKeyResponse self = new ResetAgenticDBTenantApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ResetAgenticDBTenantApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAgenticDBTenantApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAgenticDBTenantApiKeyResponse setBody(ResetAgenticDBTenantApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAgenticDBTenantApiKeyResponseBody getBody() {
        return this.body;
    }

}
