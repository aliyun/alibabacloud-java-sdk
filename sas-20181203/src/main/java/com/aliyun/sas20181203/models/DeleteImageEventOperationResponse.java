// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteImageEventOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageEventOperationResponseBody body;

    public static DeleteImageEventOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageEventOperationResponse self = new DeleteImageEventOperationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageEventOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageEventOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageEventOperationResponse setBody(DeleteImageEventOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageEventOperationResponseBody getBody() {
        return this.body;
    }

}
