// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushInstanceForDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlushInstanceForDBResponseBody body;

    public static FlushInstanceForDBResponse build(java.util.Map<String, ?> map) throws Exception {
        FlushInstanceForDBResponse self = new FlushInstanceForDBResponse();
        return TeaModel.build(map, self);
    }

    public FlushInstanceForDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlushInstanceForDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlushInstanceForDBResponse setBody(FlushInstanceForDBResponseBody body) {
        this.body = body;
        return this;
    }
    public FlushInstanceForDBResponseBody getBody() {
        return this.body;
    }

}
