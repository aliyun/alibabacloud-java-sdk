// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopTuleTypeResponseBody body;

    public static DescribeRuleHitsTopTuleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopTuleTypeResponse self = new DescribeRuleHitsTopTuleTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopTuleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopTuleTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopTuleTypeResponse setBody(DescribeRuleHitsTopTuleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopTuleTypeResponseBody getBody() {
        return this.body;
    }

}
