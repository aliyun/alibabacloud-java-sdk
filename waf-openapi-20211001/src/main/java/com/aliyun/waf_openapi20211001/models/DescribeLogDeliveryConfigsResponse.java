// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogDeliveryConfigsResponseBody body;

    public static DescribeLogDeliveryConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogDeliveryConfigsResponse self = new DescribeLogDeliveryConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogDeliveryConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogDeliveryConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogDeliveryConfigsResponse setBody(DescribeLogDeliveryConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogDeliveryConfigsResponseBody getBody() {
        return this.body;
    }

}
