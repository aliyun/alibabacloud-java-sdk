// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressConnectTrafficQosQueueResponseBody body;

    public static DescribeExpressConnectTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosQueueResponse self = new DescribeExpressConnectTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressConnectTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressConnectTrafficQosQueueResponse setBody(DescribeExpressConnectTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressConnectTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
