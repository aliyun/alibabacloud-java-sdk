// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindTagResponseBody body;

    public static UnbindTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindTagResponse self = new UnbindTagResponse();
        return TeaModel.build(map, self);
    }

    public UnbindTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindTagResponse setBody(UnbindTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindTagResponseBody getBody() {
        return this.body;
    }

}
