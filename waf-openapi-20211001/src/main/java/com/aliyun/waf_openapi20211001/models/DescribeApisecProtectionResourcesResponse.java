// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecProtectionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecProtectionResourcesResponseBody body;

    public static DescribeApisecProtectionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecProtectionResourcesResponse self = new DescribeApisecProtectionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecProtectionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecProtectionResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecProtectionResourcesResponse setBody(DescribeApisecProtectionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecProtectionResourcesResponseBody getBody() {
        return this.body;
    }

}
