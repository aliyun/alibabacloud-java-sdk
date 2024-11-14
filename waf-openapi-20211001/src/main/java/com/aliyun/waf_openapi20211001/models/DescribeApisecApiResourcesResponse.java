// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecApiResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecApiResourcesResponseBody body;

    public static DescribeApisecApiResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecApiResourcesResponse self = new DescribeApisecApiResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecApiResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecApiResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecApiResourcesResponse setBody(DescribeApisecApiResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecApiResourcesResponseBody getBody() {
        return this.body;
    }

}
