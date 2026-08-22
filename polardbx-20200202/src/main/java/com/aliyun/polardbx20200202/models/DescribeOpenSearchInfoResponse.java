// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchInfoResponseBody body;

    public static DescribeOpenSearchInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchInfoResponse self = new DescribeOpenSearchInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchInfoResponse setBody(DescribeOpenSearchInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchInfoResponseBody getBody() {
        return this.body;
    }

}
