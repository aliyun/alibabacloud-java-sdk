// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExpressSyncSharesResponseBody body;

    public static DescribeExpressSyncSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncSharesResponse self = new DescribeExpressSyncSharesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressSyncSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressSyncSharesResponse setBody(DescribeExpressSyncSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressSyncSharesResponseBody getBody() {
        return this.body;
    }

}
