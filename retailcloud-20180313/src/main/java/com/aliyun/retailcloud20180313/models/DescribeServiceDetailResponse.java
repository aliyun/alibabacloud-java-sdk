// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceDetailResponseBody body;

    public static DescribeServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDetailResponse self = new DescribeServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceDetailResponse setBody(DescribeServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceDetailResponseBody getBody() {
        return this.body;
    }

}
