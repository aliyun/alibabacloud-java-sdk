// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQosPolicyResponseBody body;

    public static CreateQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyResponse self = new CreateQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQosPolicyResponse setBody(CreateQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosPolicyResponseBody getBody() {
        return this.body;
    }

}
