// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceAntiBruteForceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAntiBruteForceRulesResponseBody body;

    public static DescribeInstanceAntiBruteForceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAntiBruteForceRulesResponse self = new DescribeInstanceAntiBruteForceRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAntiBruteForceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAntiBruteForceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAntiBruteForceRulesResponse setBody(DescribeInstanceAntiBruteForceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAntiBruteForceRulesResponseBody getBody() {
        return this.body;
    }

}
