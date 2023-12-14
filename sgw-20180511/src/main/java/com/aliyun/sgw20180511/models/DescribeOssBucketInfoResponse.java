// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssBucketInfoResponseBody body;

    public static DescribeOssBucketInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketInfoResponse self = new DescribeOssBucketInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssBucketInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssBucketInfoResponse setBody(DescribeOssBucketInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssBucketInfoResponseBody getBody() {
        return this.body;
    }

}
