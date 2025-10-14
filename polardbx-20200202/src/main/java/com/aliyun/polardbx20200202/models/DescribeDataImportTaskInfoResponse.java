// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDataImportTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataImportTaskInfoResponseBody body;

    public static DescribeDataImportTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTaskInfoResponse self = new DescribeDataImportTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataImportTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataImportTaskInfoResponse setBody(DescribeDataImportTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataImportTaskInfoResponseBody getBody() {
        return this.body;
    }

}
