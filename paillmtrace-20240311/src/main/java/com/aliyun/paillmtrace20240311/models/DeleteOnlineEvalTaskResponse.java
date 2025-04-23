// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class DeleteOnlineEvalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOnlineEvalTaskResponseBody body;

    public static DeleteOnlineEvalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOnlineEvalTaskResponse self = new DeleteOnlineEvalTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOnlineEvalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOnlineEvalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOnlineEvalTaskResponse setBody(DeleteOnlineEvalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOnlineEvalTaskResponseBody getBody() {
        return this.body;
    }

}
