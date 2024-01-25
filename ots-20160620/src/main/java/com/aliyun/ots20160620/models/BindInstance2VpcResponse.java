// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class BindInstance2VpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindInstance2VpcResponseBody body;

    public static BindInstance2VpcResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInstance2VpcResponse self = new BindInstance2VpcResponse();
        return TeaModel.build(map, self);
    }

    public BindInstance2VpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInstance2VpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindInstance2VpcResponse setBody(BindInstance2VpcResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInstance2VpcResponseBody getBody() {
        return this.body;
    }

}
