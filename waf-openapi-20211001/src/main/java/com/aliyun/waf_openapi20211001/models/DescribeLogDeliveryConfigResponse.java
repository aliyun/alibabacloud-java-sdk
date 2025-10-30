// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogDeliveryConfigResponseBody body;

    public static DescribeLogDeliveryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogDeliveryConfigResponse self = new DescribeLogDeliveryConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogDeliveryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogDeliveryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogDeliveryConfigResponse setBody(DescribeLogDeliveryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogDeliveryConfigResponseBody getBody() {
        return this.body;
    }

}
