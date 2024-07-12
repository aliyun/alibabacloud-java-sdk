// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeleteFailureMsgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFailureMsgResponseBody body;

    public static DeleteFailureMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailureMsgResponse self = new DeleteFailureMsgResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFailureMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFailureMsgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFailureMsgResponse setBody(DeleteFailureMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFailureMsgResponseBody getBody() {
        return this.body;
    }

}
