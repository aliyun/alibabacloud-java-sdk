// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGreyTagRouteResponseBody body;

    public static DescribeGreyTagRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreyTagRouteResponse self = new DescribeGreyTagRouteResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGreyTagRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGreyTagRouteResponse setBody(DescribeGreyTagRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGreyTagRouteResponseBody getBody() {
        return this.body;
    }

}
