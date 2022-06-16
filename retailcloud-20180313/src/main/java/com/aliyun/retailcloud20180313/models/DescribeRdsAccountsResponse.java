// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeRdsAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsAccountsResponseBody body;

    public static DescribeRdsAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAccountsResponse self = new DescribeRdsAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsAccountsResponse setBody(DescribeRdsAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsAccountsResponseBody getBody() {
        return this.body;
    }

}
