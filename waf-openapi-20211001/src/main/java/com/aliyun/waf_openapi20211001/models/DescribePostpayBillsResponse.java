// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePostpayBillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePostpayBillsResponseBody body;

    public static DescribePostpayBillsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillsResponse self = new DescribePostpayBillsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePostpayBillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePostpayBillsResponse setBody(DescribePostpayBillsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePostpayBillsResponseBody getBody() {
        return this.body;
    }

}
