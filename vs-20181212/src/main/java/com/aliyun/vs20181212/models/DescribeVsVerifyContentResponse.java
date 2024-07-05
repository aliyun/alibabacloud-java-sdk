// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsVerifyContentResponseBody body;

    public static DescribeVsVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsVerifyContentResponse self = new DescribeVsVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsVerifyContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsVerifyContentResponse setBody(DescribeVsVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsVerifyContentResponseBody getBody() {
        return this.body;
    }

}
