// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindTagResponseBody body;

    public static BindTagResponse build(java.util.Map<String, ?> map) throws Exception {
        BindTagResponse self = new BindTagResponse();
        return TeaModel.build(map, self);
    }

    public BindTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindTagResponse setBody(BindTagResponseBody body) {
        this.body = body;
        return this;
    }
    public BindTagResponseBody getBody() {
        return this.body;
    }

}
