// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerPluginRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddContainerPluginRuleResponseBody body;

    public static AddContainerPluginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContainerPluginRuleResponse self = new AddContainerPluginRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddContainerPluginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContainerPluginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContainerPluginRuleResponse setBody(AddContainerPluginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContainerPluginRuleResponseBody getBody() {
        return this.body;
    }

}
