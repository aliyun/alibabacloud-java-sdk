// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarVersionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeColumnarVersionListResponseBody body;

    public static DescribeColumnarVersionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarVersionListResponse self = new DescribeColumnarVersionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarVersionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColumnarVersionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColumnarVersionListResponse setBody(DescribeColumnarVersionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColumnarVersionListResponseBody getBody() {
        return this.body;
    }

}
