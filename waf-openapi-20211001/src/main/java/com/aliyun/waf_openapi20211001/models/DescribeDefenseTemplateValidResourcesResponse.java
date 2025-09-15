// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateValidResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseTemplateValidResourcesResponseBody body;

    public static DescribeDefenseTemplateValidResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateValidResourcesResponse self = new DescribeDefenseTemplateValidResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateValidResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseTemplateValidResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseTemplateValidResourcesResponse setBody(DescribeDefenseTemplateValidResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseTemplateValidResourcesResponseBody getBody() {
        return this.body;
    }

}
