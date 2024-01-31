// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerPluginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContainerPluginRuleResponseBody body;

    public static DeleteContainerPluginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerPluginRuleResponse self = new DeleteContainerPluginRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerPluginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerPluginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContainerPluginRuleResponse setBody(DeleteContainerPluginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerPluginRuleResponseBody getBody() {
        return this.body;
    }

}
