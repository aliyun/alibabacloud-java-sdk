// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWafSourceIpSegmentResponseBody body;

    public static DescribeWafSourceIpSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafSourceIpSegmentResponse self = new DescribeWafSourceIpSegmentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWafSourceIpSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWafSourceIpSegmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWafSourceIpSegmentResponse setBody(DescribeWafSourceIpSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWafSourceIpSegmentResponseBody getBody() {
        return this.body;
    }

}
