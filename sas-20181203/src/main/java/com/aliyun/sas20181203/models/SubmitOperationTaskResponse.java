// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitOperationTaskResponseBody body;

    public static SubmitOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationTaskResponse self = new SubmitOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOperationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitOperationTaskResponse setBody(SubmitOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOperationTaskResponseBody getBody() {
        return this.body;
    }

}
