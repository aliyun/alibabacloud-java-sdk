// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserVpcAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserVpcAuthorizationsResponseBody body;

    public static DescribeUserVpcAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVpcAuthorizationsResponse self = new DescribeUserVpcAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserVpcAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserVpcAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserVpcAuthorizationsResponse setBody(DescribeUserVpcAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserVpcAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
