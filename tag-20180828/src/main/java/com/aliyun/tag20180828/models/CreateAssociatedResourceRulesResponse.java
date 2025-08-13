// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateAssociatedResourceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAssociatedResourceRulesResponseBody body;

    public static CreateAssociatedResourceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssociatedResourceRulesResponse self = new CreateAssociatedResourceRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssociatedResourceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssociatedResourceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAssociatedResourceRulesResponse setBody(CreateAssociatedResourceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAssociatedResourceRulesResponseBody getBody() {
        return this.body;
    }

}
