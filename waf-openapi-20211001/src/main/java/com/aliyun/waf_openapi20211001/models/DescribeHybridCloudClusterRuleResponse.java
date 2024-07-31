// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudClusterRuleResponseBody body;

    public static DescribeHybridCloudClusterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRuleResponse self = new DescribeHybridCloudClusterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudClusterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudClusterRuleResponse setBody(DescribeHybridCloudClusterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudClusterRuleResponseBody getBody() {
        return this.body;
    }

}
