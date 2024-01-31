// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInterceptionTargetResponseBody body;

    public static CreateInterceptionTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionTargetResponse self = new CreateInterceptionTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInterceptionTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInterceptionTargetResponse setBody(CreateInterceptionTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInterceptionTargetResponseBody getBody() {
        return this.body;
    }

}
