// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallListTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCallListTestResponseBody body;

    public static DescribeCallListTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListTestResponse self = new DescribeCallListTestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallListTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallListTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallListTestResponse setBody(DescribeCallListTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallListTestResponseBody getBody() {
        return this.body;
    }

}
