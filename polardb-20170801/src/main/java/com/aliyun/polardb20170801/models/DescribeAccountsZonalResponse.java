// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAccountsZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountsZonalResponseBody body;

    public static DescribeAccountsZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsZonalResponse self = new DescribeAccountsZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountsZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountsZonalResponse setBody(DescribeAccountsZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountsZonalResponseBody getBody() {
        return this.body;
    }

}
