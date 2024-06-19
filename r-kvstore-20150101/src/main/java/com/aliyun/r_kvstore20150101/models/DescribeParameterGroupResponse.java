// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterGroupResponseBody body;

    public static DescribeParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponse self = new DescribeParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterGroupResponse setBody(DescribeParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupResponseBody getBody() {
        return this.body;
    }

}
