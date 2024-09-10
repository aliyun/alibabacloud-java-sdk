// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAutoTagRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateAutoTagRuleResponseBody body;

    public static CreateOrUpdateAutoTagRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAutoTagRuleResponse self = new CreateOrUpdateAutoTagRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAutoTagRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateAutoTagRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateAutoTagRuleResponse setBody(CreateOrUpdateAutoTagRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateAutoTagRuleResponseBody getBody() {
        return this.body;
    }

}
