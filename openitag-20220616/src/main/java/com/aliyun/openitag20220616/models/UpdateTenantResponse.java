// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTenantResponseBody body;

    public static UpdateTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantResponse self = new UpdateTenantResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTenantResponse setBody(UpdateTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantResponseBody getBody() {
        return this.body;
    }

}
