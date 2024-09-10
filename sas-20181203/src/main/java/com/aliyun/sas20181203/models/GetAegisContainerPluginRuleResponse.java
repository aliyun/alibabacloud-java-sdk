// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAegisContainerPluginRuleResponseBody body;

    public static GetAegisContainerPluginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleResponse self = new GetAegisContainerPluginRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAegisContainerPluginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAegisContainerPluginRuleResponse setBody(GetAegisContainerPluginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAegisContainerPluginRuleResponseBody getBody() {
        return this.body;
    }

}
