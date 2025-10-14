// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeColumnarInfoResponseBody body;

    public static DescribeColumnarInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarInfoResponse self = new DescribeColumnarInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColumnarInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColumnarInfoResponse setBody(DescribeColumnarInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColumnarInfoResponseBody getBody() {
        return this.body;
    }

}
