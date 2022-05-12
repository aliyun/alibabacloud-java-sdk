// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddBackendServersResponseBody body;

    public static AddBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersResponse self = new AddBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public AddBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBackendServersResponse setBody(AddBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBackendServersResponseBody getBody() {
        return this.body;
    }

}
