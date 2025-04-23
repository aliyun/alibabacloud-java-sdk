// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class UpdateOnlineEvalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOnlineEvalTaskResponseBody body;

    public static UpdateOnlineEvalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnlineEvalTaskResponse self = new UpdateOnlineEvalTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOnlineEvalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOnlineEvalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOnlineEvalTaskResponse setBody(UpdateOnlineEvalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOnlineEvalTaskResponseBody getBody() {
        return this.body;
    }

}
