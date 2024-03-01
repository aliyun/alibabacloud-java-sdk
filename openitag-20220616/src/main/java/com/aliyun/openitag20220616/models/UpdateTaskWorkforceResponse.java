// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTaskWorkforceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskWorkforceResponseBody body;

    public static UpdateTaskWorkforceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskWorkforceResponse self = new UpdateTaskWorkforceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskWorkforceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskWorkforceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskWorkforceResponse setBody(UpdateTaskWorkforceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskWorkforceResponseBody getBody() {
        return this.body;
    }

}
