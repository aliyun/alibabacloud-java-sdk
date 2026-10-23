// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticDBTenantResponseBody body;

    public static CreateAgenticDBTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBTenantResponse self = new CreateAgenticDBTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticDBTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticDBTenantResponse setBody(CreateAgenticDBTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticDBTenantResponseBody getBody() {
        return this.body;
    }

}
