// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class InitSasModuleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitSasModuleRuleResponseBody body;

    public static InitSasModuleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitSasModuleRuleResponse self = new InitSasModuleRuleResponse();
        return TeaModel.build(map, self);
    }

    public InitSasModuleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitSasModuleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitSasModuleRuleResponse setBody(InitSasModuleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitSasModuleRuleResponseBody getBody() {
        return this.body;
    }

}
