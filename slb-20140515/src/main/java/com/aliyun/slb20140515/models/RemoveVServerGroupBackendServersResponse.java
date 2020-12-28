// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveVServerGroupBackendServersResponse setBody(RemoveVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
