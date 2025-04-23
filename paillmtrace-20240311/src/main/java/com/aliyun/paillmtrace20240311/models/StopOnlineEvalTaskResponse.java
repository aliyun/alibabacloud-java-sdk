// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class StopOnlineEvalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopOnlineEvalTaskResponseBody body;

    public static StopOnlineEvalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOnlineEvalTaskResponse self = new StopOnlineEvalTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopOnlineEvalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOnlineEvalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopOnlineEvalTaskResponse setBody(StopOnlineEvalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOnlineEvalTaskResponseBody getBody() {
        return this.body;
    }

}
