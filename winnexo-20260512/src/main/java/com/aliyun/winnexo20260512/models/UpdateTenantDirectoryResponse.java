// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateTenantDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTenantDirectoryResponseBody body;

    public static UpdateTenantDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantDirectoryResponse self = new UpdateTenantDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTenantDirectoryResponse setBody(UpdateTenantDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantDirectoryResponseBody getBody() {
        return this.body;
    }

}
