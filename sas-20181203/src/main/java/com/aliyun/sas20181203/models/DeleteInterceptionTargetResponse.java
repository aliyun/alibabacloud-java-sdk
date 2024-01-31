// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInterceptionTargetResponseBody body;

    public static DeleteInterceptionTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionTargetResponse self = new DeleteInterceptionTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInterceptionTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInterceptionTargetResponse setBody(DeleteInterceptionTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInterceptionTargetResponseBody getBody() {
        return this.body;
    }

}
