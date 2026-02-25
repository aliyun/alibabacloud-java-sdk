// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class IsolateLeaderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IsolateLeaderResponseBody body;

    public static IsolateLeaderResponse build(java.util.Map<String, ?> map) throws Exception {
        IsolateLeaderResponse self = new IsolateLeaderResponse();
        return TeaModel.build(map, self);
    }

    public IsolateLeaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsolateLeaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsolateLeaderResponse setBody(IsolateLeaderResponseBody body) {
        this.body = body;
        return this;
    }
    public IsolateLeaderResponseBody getBody() {
        return this.body;
    }

}
