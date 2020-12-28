// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetBackendServersResponseBody body;

    public static SetBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersResponse self = new SetBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public SetBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBackendServersResponse setBody(SetBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBackendServersResponseBody getBody() {
        return this.body;
    }

}
