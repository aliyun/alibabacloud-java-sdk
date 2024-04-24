// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateValidGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseTemplateValidGroupsResponseBody body;

    public static DescribeDefenseTemplateValidGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateValidGroupsResponse self = new DescribeDefenseTemplateValidGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateValidGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseTemplateValidGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseTemplateValidGroupsResponse setBody(DescribeDefenseTemplateValidGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseTemplateValidGroupsResponseBody getBody() {
        return this.body;
    }

}
