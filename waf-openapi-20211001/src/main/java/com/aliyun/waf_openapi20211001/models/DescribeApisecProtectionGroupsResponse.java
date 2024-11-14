// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecProtectionGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecProtectionGroupsResponseBody body;

    public static DescribeApisecProtectionGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecProtectionGroupsResponse self = new DescribeApisecProtectionGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecProtectionGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecProtectionGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecProtectionGroupsResponse setBody(DescribeApisecProtectionGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecProtectionGroupsResponseBody getBody() {
        return this.body;
    }

}
