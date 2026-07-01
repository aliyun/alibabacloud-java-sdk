// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBTenantApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDBTenantApiKeyResponseBody body;

    public static DeleteAgenticDBTenantApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBTenantApiKeyResponse self = new DeleteAgenticDBTenantApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBTenantApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDBTenantApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDBTenantApiKeyResponse setBody(DeleteAgenticDBTenantApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDBTenantApiKeyResponseBody getBody() {
        return this.body;
    }

}
