// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserBusinessStatusResponseBody body;

    public static DescribeUserBusinessStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessStatusResponse self = new DescribeUserBusinessStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBusinessStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBusinessStatusResponse setBody(DescribeUserBusinessStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBusinessStatusResponseBody getBody() {
        return this.body;
    }

}
