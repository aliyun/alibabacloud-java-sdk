// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupResponseBody body;

    public static DescribeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupResponse self = new DescribeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupResponse setBody(DescribeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupResponseBody getBody() {
        return this.body;
    }

}
