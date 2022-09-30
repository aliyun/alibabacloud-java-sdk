// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityIpGroupsResponseBody body;

    public static DescribeSecurityIpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpGroupsResponse self = new DescribeSecurityIpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityIpGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityIpGroupsResponse setBody(DescribeSecurityIpGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityIpGroupsResponseBody getBody() {
        return this.body;
    }

}
