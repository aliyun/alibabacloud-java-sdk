// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogDeliveryStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceLogDeliveryStatusResponseBody body;

    public static DescribeResourceLogDeliveryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogDeliveryStatusResponse self = new DescribeResourceLogDeliveryStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogDeliveryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLogDeliveryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceLogDeliveryStatusResponse setBody(DescribeResourceLogDeliveryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLogDeliveryStatusResponseBody getBody() {
        return this.body;
    }

}
