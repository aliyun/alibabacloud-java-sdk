// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePxfsTenantResponseBody body;

    public static CreatePxfsTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsTenantResponse self = new CreatePxfsTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreatePxfsTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePxfsTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePxfsTenantResponse setBody(CreatePxfsTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePxfsTenantResponseBody getBody() {
        return this.body;
    }

}
