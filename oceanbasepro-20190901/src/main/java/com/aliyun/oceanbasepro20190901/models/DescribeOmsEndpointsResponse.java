// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsEndpointsResponseBody body;

    public static DescribeOmsEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointsResponse self = new DescribeOmsEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsEndpointsResponse setBody(DescribeOmsEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsEndpointsResponseBody getBody() {
        return this.body;
    }

}
