// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktWorkitemrelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeLinktWorkitemrelationResponseBody body;

    public static RemoveLinkeLinktWorkitemrelationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktWorkitemrelationResponse self = new RemoveLinkeLinktWorkitemrelationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktWorkitemrelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeLinktWorkitemrelationResponse setBody(RemoveLinkeLinktWorkitemrelationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeLinktWorkitemrelationResponseBody getBody() {
        return this.body;
    }

}
