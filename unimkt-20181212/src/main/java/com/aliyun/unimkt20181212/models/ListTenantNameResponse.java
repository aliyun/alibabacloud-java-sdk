// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTenantNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListTenantNameResponse setBody(ListTenantNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantNameResponseBody getBody() {
        return this.body;
    }

}
