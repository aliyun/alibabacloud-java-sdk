// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CancelRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRunResponseBody body;

    public static CancelRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRunResponse self = new CancelRunResponse();
        return TeaModel.build(map, self);
    }

    public CancelRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRunResponse setBody(CancelRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRunResponseBody getBody() {
        return this.body;
    }

}
