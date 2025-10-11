// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHistoryTasksStatResponseBody body;

    public static DescribeHistoryTasksStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatResponse self = new DescribeHistoryTasksStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryTasksStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryTasksStatResponse setBody(DescribeHistoryTasksStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryTasksStatResponseBody getBody() {
        return this.body;
    }

}
