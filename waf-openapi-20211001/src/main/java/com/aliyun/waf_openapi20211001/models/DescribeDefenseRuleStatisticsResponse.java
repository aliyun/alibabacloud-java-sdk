// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseRuleStatisticsResponseBody body;

    public static DescribeDefenseRuleStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleStatisticsResponse self = new DescribeDefenseRuleStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseRuleStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseRuleStatisticsResponse setBody(DescribeDefenseRuleStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseRuleStatisticsResponseBody getBody() {
        return this.body;
    }

}
