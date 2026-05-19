// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectClientRuleResponseBody body;

    public static GetFileProtectClientRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientRuleResponse self = new GetFileProtectClientRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectClientRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectClientRuleResponse setBody(GetFileProtectClientRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectClientRuleResponseBody getBody() {
        return this.body;
    }

}
