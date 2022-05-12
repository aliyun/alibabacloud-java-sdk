// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveBackendServersResponseBody body;

    public static RemoveBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersResponse self = new RemoveBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveBackendServersResponse setBody(RemoveBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBackendServersResponseBody getBody() {
        return this.body;
    }

}
