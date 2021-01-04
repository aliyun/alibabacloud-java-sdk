// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToCcnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantSagInstanceToCcnResponseBody body;

    public static GrantSagInstanceToCcnResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToCcnResponse self = new GrantSagInstanceToCcnResponse();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToCcnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantSagInstanceToCcnResponse setBody(GrantSagInstanceToCcnResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantSagInstanceToCcnResponseBody getBody() {
        return this.body;
    }

}
