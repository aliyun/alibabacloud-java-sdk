// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAllTenantBindNumberBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllTenantBindNumberBindingResponseBody body;

    public static ListAllTenantBindNumberBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllTenantBindNumberBindingResponse self = new ListAllTenantBindNumberBindingResponse();
        return TeaModel.build(map, self);
    }

    public ListAllTenantBindNumberBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllTenantBindNumberBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllTenantBindNumberBindingResponse setBody(ListAllTenantBindNumberBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllTenantBindNumberBindingResponseBody getBody() {
        return this.body;
    }

}
