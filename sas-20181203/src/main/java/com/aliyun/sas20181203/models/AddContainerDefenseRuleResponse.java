// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddContainerDefenseRuleResponseBody body;

    public static AddContainerDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContainerDefenseRuleResponse self = new AddContainerDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddContainerDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContainerDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContainerDefenseRuleResponse setBody(AddContainerDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContainerDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
