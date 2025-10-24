// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChargeResultResponseBody body;

    public static DescribeChargeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeResultResponse self = new DescribeChargeResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChargeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChargeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChargeResultResponse setBody(DescribeChargeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChargeResultResponseBody getBody() {
        return this.body;
    }

}
