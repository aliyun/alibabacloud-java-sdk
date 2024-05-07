// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceRuleResponseBody body;

    public static GetResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRuleResponse self = new GetResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceRuleResponse setBody(GetResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceRuleResponseBody getBody() {
        return this.body;
    }

}
