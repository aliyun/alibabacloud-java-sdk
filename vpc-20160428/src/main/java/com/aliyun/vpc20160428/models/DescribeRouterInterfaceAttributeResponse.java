// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeRouterInterfaceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRouterInterfaceAttributeResponse setBody(DescribeRouterInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouterInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
