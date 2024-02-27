// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressConnectTrafficQosRuleResponseBody body;

    public static CreateExpressConnectTrafficQosRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosRuleResponse self = new CreateExpressConnectTrafficQosRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressConnectTrafficQosRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressConnectTrafficQosRuleResponse setBody(CreateExpressConnectTrafficQosRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressConnectTrafficQosRuleResponseBody getBody() {
        return this.body;
    }

}
