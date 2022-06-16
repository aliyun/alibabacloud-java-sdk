// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeJobLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJobLogResponseBody body;

    public static DescribeJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobLogResponse self = new DescribeJobLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobLogResponse setBody(DescribeJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobLogResponseBody getBody() {
        return this.body;
    }

}
