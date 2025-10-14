// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarClassListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeColumnarClassListResponseBody body;

    public static DescribeColumnarClassListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarClassListResponse self = new DescribeColumnarClassListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarClassListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColumnarClassListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColumnarClassListResponse setBody(DescribeColumnarClassListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColumnarClassListResponseBody getBody() {
        return this.body;
    }

}
