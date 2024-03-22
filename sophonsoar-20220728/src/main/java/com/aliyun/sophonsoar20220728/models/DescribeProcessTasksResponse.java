// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProcessTasksResponseBody body;

    public static DescribeProcessTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTasksResponse self = new DescribeProcessTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessTasksResponse setBody(DescribeProcessTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessTasksResponseBody getBody() {
        return this.body;
    }

}
