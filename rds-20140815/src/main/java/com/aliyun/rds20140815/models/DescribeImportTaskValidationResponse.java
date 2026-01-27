// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskValidationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImportTaskValidationResponseBody body;

    public static DescribeImportTaskValidationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportTaskValidationResponse self = new DescribeImportTaskValidationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportTaskValidationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportTaskValidationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportTaskValidationResponse setBody(DescribeImportTaskValidationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportTaskValidationResponseBody getBody() {
        return this.body;
    }

}
