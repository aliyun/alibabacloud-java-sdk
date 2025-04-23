// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetOnlineEvalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnlineEvalTaskResponseBody body;

    public static GetOnlineEvalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineEvalTaskResponse self = new GetOnlineEvalTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineEvalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineEvalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnlineEvalTaskResponse setBody(GetOnlineEvalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineEvalTaskResponseBody getBody() {
        return this.body;
    }

}
