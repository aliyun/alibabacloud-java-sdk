// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeServiceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceAccountResponseBody body;

    public static DescribeServiceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAccountResponse self = new DescribeServiceAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceAccountResponse setBody(DescribeServiceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceAccountResponseBody getBody() {
        return this.body;
    }

}
