// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTenantNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTenantNameResponseBody body;

    public static ListTenantNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantNameResponse self = new ListTenantNameResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantNameResponse setBody(ListTenantNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantNameResponseBody getBody() {
        return this.body;
    }

}
