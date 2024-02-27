// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectTrafficQosRuleResponseBody body;

    public static DeleteExpressConnectTrafficQosRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosRuleResponse self = new DeleteExpressConnectTrafficQosRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectTrafficQosRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectTrafficQosRuleResponse setBody(DeleteExpressConnectTrafficQosRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectTrafficQosRuleResponseBody getBody() {
        return this.body;
    }

}
