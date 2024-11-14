// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecUserOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecUserOperationsResponseBody body;

    public static DescribeApisecUserOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecUserOperationsResponse self = new DescribeApisecUserOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecUserOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecUserOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecUserOperationsResponse setBody(DescribeApisecUserOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecUserOperationsResponseBody getBody() {
        return this.body;
    }

}
