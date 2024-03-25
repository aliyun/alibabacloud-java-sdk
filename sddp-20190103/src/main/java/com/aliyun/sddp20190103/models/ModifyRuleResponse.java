// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRuleResponseBody body;

    public static ModifyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponse self = new ModifyRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRuleResponse setBody(ModifyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRuleResponseBody getBody() {
        return this.body;
    }

}
