// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecLogDeliveriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecLogDeliveriesResponseBody body;

    public static DescribeApisecLogDeliveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecLogDeliveriesResponse self = new DescribeApisecLogDeliveriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecLogDeliveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecLogDeliveriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecLogDeliveriesResponse setBody(DescribeApisecLogDeliveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecLogDeliveriesResponseBody getBody() {
        return this.body;
    }

}
