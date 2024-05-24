// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveVServerGroupBackendServersResponseBody body;

    public static RemoveVServerGroupBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVServerGroupBackendServersResponse self = new RemoveVServerGroupBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVServerGroupBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVServerGroupBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVServerGroupBackendServersResponse setBody(RemoveVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
