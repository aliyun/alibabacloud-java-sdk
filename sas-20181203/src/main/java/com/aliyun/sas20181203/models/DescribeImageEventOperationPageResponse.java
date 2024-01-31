// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageEventOperationPageResponseBody body;

    public static DescribeImageEventOperationPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationPageResponse self = new DescribeImageEventOperationPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageEventOperationPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageEventOperationPageResponse setBody(DescribeImageEventOperationPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageEventOperationPageResponseBody getBody() {
        return this.body;
    }

}
