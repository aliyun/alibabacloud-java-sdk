// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectTrafficQosRuleResponseBody body;

    public static DescribeExpressConnectTrafficQosRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosRuleResponse self = new DescribeExpressConnectTrafficQosRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectTrafficQosRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectTrafficQosRuleResponse setBody(DescribeExpressConnectTrafficQosRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectTrafficQosRuleResponseBody getBody() {
        return this.body;
    }

}
