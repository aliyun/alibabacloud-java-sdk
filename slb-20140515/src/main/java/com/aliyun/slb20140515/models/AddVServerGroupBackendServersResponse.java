// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddVServerGroupBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddVServerGroupBackendServersResponse setBody(AddVServerGroupBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

}
