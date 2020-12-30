// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouterInterfacesResponseBody body;

    public static DescribeRouterInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponse self = new DescribeRouterInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouterInterfacesResponse setBody(DescribeRouterInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouterInterfacesResponseBody getBody() {
        return this.body;
    }

}
