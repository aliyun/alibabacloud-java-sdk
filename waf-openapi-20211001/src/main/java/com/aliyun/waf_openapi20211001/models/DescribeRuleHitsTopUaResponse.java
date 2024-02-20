// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopUaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopUaResponseBody body;

    public static DescribeRuleHitsTopUaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopUaResponse self = new DescribeRuleHitsTopUaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopUaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopUaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopUaResponse setBody(DescribeRuleHitsTopUaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopUaResponseBody getBody() {
        return this.body;
    }

}
