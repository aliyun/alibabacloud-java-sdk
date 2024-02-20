// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseRuleResponseBody body;

    public static ModifyDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleResponse self = new ModifyDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseRuleResponse setBody(ModifyDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
