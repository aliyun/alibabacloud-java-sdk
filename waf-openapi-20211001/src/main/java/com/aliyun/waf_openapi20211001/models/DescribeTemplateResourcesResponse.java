// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateResourcesResponseBody body;

    public static DescribeTemplateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourcesResponse self = new DescribeTemplateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateResourcesResponse setBody(DescribeTemplateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateResourcesResponseBody getBody() {
        return this.body;
    }

}
