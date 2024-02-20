// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowTopUrlResponseBody body;

    public static DescribeFlowTopUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopUrlResponse self = new DescribeFlowTopUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowTopUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowTopUrlResponse setBody(DescribeFlowTopUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowTopUrlResponseBody getBody() {
        return this.body;
    }

}
