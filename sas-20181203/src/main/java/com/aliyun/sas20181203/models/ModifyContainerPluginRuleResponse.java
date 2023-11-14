// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerPluginRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyContainerPluginRuleResponseBody body;

    public static ModifyContainerPluginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerPluginRuleResponse self = new ModifyContainerPluginRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerPluginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerPluginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContainerPluginRuleResponse setBody(ModifyContainerPluginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerPluginRuleResponseBody getBody() {
        return this.body;
    }

}
