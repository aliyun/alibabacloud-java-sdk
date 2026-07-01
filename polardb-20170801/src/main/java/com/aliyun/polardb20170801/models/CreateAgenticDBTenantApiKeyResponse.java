// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBTenantApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticDBTenantApiKeyResponseBody body;

    public static CreateAgenticDBTenantApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBTenantApiKeyResponse self = new CreateAgenticDBTenantApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBTenantApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticDBTenantApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticDBTenantApiKeyResponse setBody(CreateAgenticDBTenantApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticDBTenantApiKeyResponseBody getBody() {
        return this.body;
    }

}
