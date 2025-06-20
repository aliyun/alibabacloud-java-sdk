// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateOperatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOperatorResponseBody body;

    public static CreateOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOperatorResponse self = new CreateOperatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateOperatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOperatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOperatorResponse setBody(CreateOperatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOperatorResponseBody getBody() {
        return this.body;
    }

}
