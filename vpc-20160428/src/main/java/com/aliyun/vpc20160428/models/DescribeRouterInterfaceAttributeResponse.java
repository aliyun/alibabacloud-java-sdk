// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouterInterfaceAttributeResponseBody body;

    public static DescribeRouterInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfaceAttributeResponse self = new DescribeRouterInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouterInterfaceAttributeResponse setBody(DescribeRouterInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouterInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
