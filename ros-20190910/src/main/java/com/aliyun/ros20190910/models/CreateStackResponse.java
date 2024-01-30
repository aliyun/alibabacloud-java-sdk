// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStackResponseBody body;

    public static CreateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackResponse self = new CreateStackResponse();
        return TeaModel.build(map, self);
    }

    public CreateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStackResponse setBody(CreateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStackResponseBody getBody() {
        return this.body;
    }

}
