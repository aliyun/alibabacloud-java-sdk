// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeElasticRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticRulesResponseBody body;

    public static DescribeElasticRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticRulesResponse self = new DescribeElasticRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticRulesResponse setBody(DescribeElasticRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticRulesResponseBody getBody() {
        return this.body;
    }

}
