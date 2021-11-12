// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class UnbindInstance2VpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindInstance2VpcResponseBody body;

    public static UnbindInstance2VpcResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstance2VpcResponse self = new UnbindInstance2VpcResponse();
        return TeaModel.build(map, self);
    }

    public UnbindInstance2VpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindInstance2VpcResponse setBody(UnbindInstance2VpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInstance2VpcResponseBody getBody() {
        return this.body;
    }

}
