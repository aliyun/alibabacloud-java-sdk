// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterGroupsResponseBody body;

    public static DescribeParameterGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponse self = new DescribeParameterGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterGroupsResponse setBody(DescribeParameterGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupsResponseBody getBody() {
        return this.body;
    }

}
