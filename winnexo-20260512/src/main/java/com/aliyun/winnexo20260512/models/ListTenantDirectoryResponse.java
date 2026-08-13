// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTenantDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTenantDirectoryResponseBody body;

    public static ListTenantDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantDirectoryResponse self = new ListTenantDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantDirectoryResponse setBody(ListTenantDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantDirectoryResponseBody getBody() {
        return this.body;
    }

}
