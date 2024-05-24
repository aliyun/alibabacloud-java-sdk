// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVServerGroupBackendServersResponseBody body;

    public static AddVServerGroupBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVServerGroupBackendServersResponse self = new AddVServerGroupBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public AddVServerGroupBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVServerGroupBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVServerGroupBackendServersResponse setBody(AddVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
