// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceGroupResponseBody body;

    public static DescribeDefenseResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupResponse self = new DescribeDefenseResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceGroupResponse setBody(DescribeDefenseResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

}
