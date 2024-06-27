// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperatorListResponseBody body;

    public static DescribeOperatorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListResponse self = new DescribeOperatorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperatorListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperatorListResponse setBody(DescribeOperatorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperatorListResponseBody getBody() {
        return this.body;
    }

}
