// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInterceptionRuleResponseBody body;

    public static ModifyInterceptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleResponse self = new ModifyInterceptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInterceptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInterceptionRuleResponse setBody(ModifyInterceptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInterceptionRuleResponseBody getBody() {
        return this.body;
    }

}
