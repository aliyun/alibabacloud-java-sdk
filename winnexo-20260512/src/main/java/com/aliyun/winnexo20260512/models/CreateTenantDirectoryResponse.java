// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTenantDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantDirectoryResponseBody body;

    public static CreateTenantDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDirectoryResponse self = new CreateTenantDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantDirectoryResponse setBody(CreateTenantDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantDirectoryResponseBody getBody() {
        return this.body;
    }

}
