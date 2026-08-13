// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteTenantDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTenantDirectoryResponseBody body;

    public static DeleteTenantDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantDirectoryResponse self = new DeleteTenantDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTenantDirectoryResponse setBody(DeleteTenantDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantDirectoryResponseBody getBody() {
        return this.body;
    }

}
