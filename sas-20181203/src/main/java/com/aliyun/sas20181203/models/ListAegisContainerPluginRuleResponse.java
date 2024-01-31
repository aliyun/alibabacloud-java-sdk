// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisContainerPluginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAegisContainerPluginRuleResponseBody body;

    public static ListAegisContainerPluginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAegisContainerPluginRuleResponse self = new ListAegisContainerPluginRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListAegisContainerPluginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAegisContainerPluginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAegisContainerPluginRuleResponse setBody(ListAegisContainerPluginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAegisContainerPluginRuleResponseBody getBody() {
        return this.body;
    }

}
