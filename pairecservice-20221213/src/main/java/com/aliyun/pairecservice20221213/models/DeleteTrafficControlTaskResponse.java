// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficControlTaskResponseBody body;

    public static DeleteTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTaskResponse self = new DeleteTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficControlTaskResponse setBody(DeleteTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
