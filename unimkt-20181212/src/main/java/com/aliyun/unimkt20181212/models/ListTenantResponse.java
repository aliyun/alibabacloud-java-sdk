// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTenantResponseBody body;

    public static ListTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantResponse self = new ListTenantResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantResponse setBody(ListTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantResponseBody getBody() {
        return this.body;
    }

}
