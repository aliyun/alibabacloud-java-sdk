// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateResourceCountResponseBody body;

    public static DescribeTemplateResourceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourceCountResponse self = new DescribeTemplateResourceCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateResourceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateResourceCountResponse setBody(DescribeTemplateResourceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateResourceCountResponseBody getBody() {
        return this.body;
    }

}
