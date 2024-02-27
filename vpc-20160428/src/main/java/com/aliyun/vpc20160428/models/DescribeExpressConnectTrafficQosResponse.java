// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectTrafficQosResponseBody body;

    public static DescribeExpressConnectTrafficQosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosResponse self = new DescribeExpressConnectTrafficQosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectTrafficQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectTrafficQosResponse setBody(DescribeExpressConnectTrafficQosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectTrafficQosResponseBody getBody() {
        return this.body;
    }

}
