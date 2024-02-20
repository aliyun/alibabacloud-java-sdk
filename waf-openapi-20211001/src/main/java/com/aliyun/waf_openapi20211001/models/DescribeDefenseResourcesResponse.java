// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourcesResponseBody body;

    public static DescribeDefenseResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourcesResponse self = new DescribeDefenseResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourcesResponse setBody(DescribeDefenseResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourcesResponseBody getBody() {
        return this.body;
    }

}
