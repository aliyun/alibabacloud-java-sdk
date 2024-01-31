// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHistoryTasksResponseBody body;

    public static DescribeHistoryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksResponse self = new DescribeHistoryTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryTasksResponse setBody(DescribeHistoryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryTasksResponseBody getBody() {
        return this.body;
    }

}
