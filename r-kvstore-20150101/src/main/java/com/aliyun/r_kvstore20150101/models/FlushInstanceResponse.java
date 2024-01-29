// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlushInstanceResponseBody body;

    public static FlushInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        FlushInstanceResponse self = new FlushInstanceResponse();
        return TeaModel.build(map, self);
    }

    public FlushInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlushInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlushInstanceResponse setBody(FlushInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public FlushInstanceResponseBody getBody() {
        return this.body;
    }

}
