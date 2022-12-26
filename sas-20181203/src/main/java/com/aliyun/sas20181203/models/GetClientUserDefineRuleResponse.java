// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientUserDefineRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientUserDefineRuleResponseBody body;

    public static GetClientUserDefineRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserDefineRuleResponse self = new GetClientUserDefineRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetClientUserDefineRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientUserDefineRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientUserDefineRuleResponse setBody(GetClientUserDefineRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

}
