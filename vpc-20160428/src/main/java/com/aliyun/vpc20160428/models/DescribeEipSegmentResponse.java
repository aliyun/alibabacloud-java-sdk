// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipSegmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEipSegmentResponseBody body;

    public static DescribeEipSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipSegmentResponse self = new DescribeEipSegmentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipSegmentResponse setBody(DescribeEipSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipSegmentResponseBody getBody() {
        return this.body;
    }

}
