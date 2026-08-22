// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchConnectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchConnectionInfoResponseBody body;

    public static DescribeOpenSearchConnectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchConnectionInfoResponse self = new DescribeOpenSearchConnectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchConnectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchConnectionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchConnectionInfoResponse setBody(DescribeOpenSearchConnectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchConnectionInfoResponseBody getBody() {
        return this.body;
    }

}
