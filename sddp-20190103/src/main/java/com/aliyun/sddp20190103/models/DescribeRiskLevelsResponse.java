// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskLevelsResponseBody body;

    public static DescribeRiskLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsResponse self = new DescribeRiskLevelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskLevelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskLevelsResponse setBody(DescribeRiskLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskLevelsResponseBody getBody() {
        return this.body;
    }

}
