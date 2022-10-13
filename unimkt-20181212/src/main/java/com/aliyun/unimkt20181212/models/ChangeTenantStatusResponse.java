// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeTenantStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeTenantStatusResponseBody body;

    public static ChangeTenantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeTenantStatusResponse self = new ChangeTenantStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeTenantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeTenantStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeTenantStatusResponse setBody(ChangeTenantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeTenantStatusResponseBody getBody() {
        return this.body;
    }

}
