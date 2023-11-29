// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableSpecResponseBody body;

    public static DescribeAvailableSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableSpecResponse self = new DescribeAvailableSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableSpecResponse setBody(DescribeAvailableSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableSpecResponseBody getBody() {
        return this.body;
    }

}
