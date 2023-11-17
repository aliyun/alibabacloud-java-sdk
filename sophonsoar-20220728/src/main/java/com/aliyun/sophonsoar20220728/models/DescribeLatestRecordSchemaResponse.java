// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeLatestRecordSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLatestRecordSchemaResponseBody body;

    public static DescribeLatestRecordSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestRecordSchemaResponse self = new DescribeLatestRecordSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatestRecordSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatestRecordSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatestRecordSchemaResponse setBody(DescribeLatestRecordSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatestRecordSchemaResponseBody getBody() {
        return this.body;
    }

}
