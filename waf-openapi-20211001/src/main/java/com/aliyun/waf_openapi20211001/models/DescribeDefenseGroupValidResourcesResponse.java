// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseGroupValidResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseGroupValidResourcesResponseBody body;

    public static DescribeDefenseGroupValidResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseGroupValidResourcesResponse self = new DescribeDefenseGroupValidResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseGroupValidResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseGroupValidResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseGroupValidResourcesResponse setBody(DescribeDefenseGroupValidResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseGroupValidResourcesResponseBody getBody() {
        return this.body;
    }

}
