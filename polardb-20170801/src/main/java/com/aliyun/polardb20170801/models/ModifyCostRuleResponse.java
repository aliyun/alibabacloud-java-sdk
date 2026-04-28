// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCostRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCostRuleResponseBody body;

    public static ModifyCostRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostRuleResponse self = new ModifyCostRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCostRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCostRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCostRuleResponse setBody(ModifyCostRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCostRuleResponseBody getBody() {
        return this.body;
    }

}
