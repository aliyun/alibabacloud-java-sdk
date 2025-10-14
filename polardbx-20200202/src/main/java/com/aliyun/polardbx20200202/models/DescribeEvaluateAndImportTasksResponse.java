// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEvaluateAndImportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEvaluateAndImportTasksResponseBody body;

    public static DescribeEvaluateAndImportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateAndImportTasksResponse self = new DescribeEvaluateAndImportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateAndImportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateAndImportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEvaluateAndImportTasksResponse setBody(DescribeEvaluateAndImportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateAndImportTasksResponseBody getBody() {
        return this.body;
    }

}
