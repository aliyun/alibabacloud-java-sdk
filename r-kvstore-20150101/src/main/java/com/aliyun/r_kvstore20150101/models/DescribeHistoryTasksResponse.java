// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
