// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppEnvironmentResponseBody body;

    public static ListAppEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppEnvironmentResponse self = new ListAppEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public ListAppEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppEnvironmentResponse setBody(ListAppEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppEnvironmentResponseBody getBody() {
        return this.body;
    }

}
