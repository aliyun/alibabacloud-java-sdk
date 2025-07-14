// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudClusterRulesResponseBody body;

    public static DescribeHybridCloudClusterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRulesResponse self = new DescribeHybridCloudClusterRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudClusterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudClusterRulesResponse setBody(DescribeHybridCloudClusterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudClusterRulesResponseBody getBody() {
        return this.body;
    }

}
