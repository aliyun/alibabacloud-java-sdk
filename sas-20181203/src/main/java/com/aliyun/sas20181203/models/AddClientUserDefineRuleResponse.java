// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddClientUserDefineRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddClientUserDefineRuleResponseBody body;

    public static AddClientUserDefineRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClientUserDefineRuleResponse self = new AddClientUserDefineRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddClientUserDefineRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClientUserDefineRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddClientUserDefineRuleResponse setBody(AddClientUserDefineRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

}
