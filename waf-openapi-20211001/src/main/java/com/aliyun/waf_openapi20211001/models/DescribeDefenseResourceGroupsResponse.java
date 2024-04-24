// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceGroupsResponseBody body;

    public static DescribeDefenseResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupsResponse self = new DescribeDefenseResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceGroupsResponse setBody(DescribeDefenseResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
