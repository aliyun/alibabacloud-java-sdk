// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskTypeResponseBody body;

    public static DescribeRiskTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskTypeResponse self = new DescribeRiskTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskTypeResponse setBody(DescribeRiskTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskTypeResponseBody getBody() {
        return this.body;
    }

}
