// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceDiagnosisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceDiagnosisResultResponseBody body;

    public static DescribeInstanceDiagnosisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDiagnosisResultResponse self = new DescribeInstanceDiagnosisResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDiagnosisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDiagnosisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDiagnosisResultResponse setBody(DescribeInstanceDiagnosisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDiagnosisResultResponseBody getBody() {
        return this.body;
    }

}
