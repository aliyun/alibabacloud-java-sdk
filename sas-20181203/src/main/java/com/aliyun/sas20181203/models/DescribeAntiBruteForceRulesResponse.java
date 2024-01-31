// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAntiBruteForceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntiBruteForceRulesResponseBody body;

    public static DescribeAntiBruteForceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntiBruteForceRulesResponse self = new DescribeAntiBruteForceRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntiBruteForceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntiBruteForceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntiBruteForceRulesResponse setBody(DescribeAntiBruteForceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntiBruteForceRulesResponseBody getBody() {
        return this.body;
    }

}
