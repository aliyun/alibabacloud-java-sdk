// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCycleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCycleTaskResponseBody body;

    public static DeleteCycleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCycleTaskResponse self = new DeleteCycleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCycleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCycleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCycleTaskResponse setBody(DeleteCycleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCycleTaskResponseBody getBody() {
        return this.body;
    }

}
