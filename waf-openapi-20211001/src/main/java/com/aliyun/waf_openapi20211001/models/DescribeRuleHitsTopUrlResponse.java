// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopUrlResponseBody body;

    public static DescribeRuleHitsTopUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopUrlResponse self = new DescribeRuleHitsTopUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopUrlResponse setBody(DescribeRuleHitsTopUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopUrlResponseBody getBody() {
        return this.body;
    }

}
