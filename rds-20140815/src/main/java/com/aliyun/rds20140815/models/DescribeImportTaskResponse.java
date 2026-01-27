// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImportTaskResponseBody body;

    public static DescribeImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportTaskResponse self = new DescribeImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportTaskResponse setBody(DescribeImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportTaskResponseBody getBody() {
        return this.body;
    }

}
