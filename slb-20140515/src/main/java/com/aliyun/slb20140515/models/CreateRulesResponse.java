// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRulesResponseBody body;

    public static CreateRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesResponse self = new CreateRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRulesResponse setBody(CreateRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRulesResponseBody getBody() {
        return this.body;
    }

}
