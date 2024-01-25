// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class UnbindInstance2VpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnbindInstance2VpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindInstance2VpcResponse setBody(UnbindInstance2VpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInstance2VpcResponseBody getBody() {
        return this.body;
    }

}
