// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEvaluateAndImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEvaluateAndImportTaskResponseBody body;

    public static DescribeEvaluateAndImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateAndImportTaskResponse self = new DescribeEvaluateAndImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateAndImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateAndImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEvaluateAndImportTaskResponse setBody(DescribeEvaluateAndImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateAndImportTaskResponseBody getBody() {
        return this.body;
    }

}
