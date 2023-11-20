// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyContainerDefenseRuleResponseBody body;

    public static ModifyContainerDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerDefenseRuleResponse self = new ModifyContainerDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContainerDefenseRuleResponse setBody(ModifyContainerDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
