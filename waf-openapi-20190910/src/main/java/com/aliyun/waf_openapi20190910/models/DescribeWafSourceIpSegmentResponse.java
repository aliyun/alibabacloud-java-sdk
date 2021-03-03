// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeWafSourceIpSegmentResponse setBody(DescribeWafSourceIpSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWafSourceIpSegmentResponseBody getBody() {
        return this.body;
    }

}
