// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCheckRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCheckRuleResponseBody body;

    public static ModifyCheckRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCheckRuleResponse self = new ModifyCheckRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCheckRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCheckRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCheckRuleResponse setBody(ModifyCheckRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCheckRuleResponseBody getBody() {
        return this.body;
    }

}
