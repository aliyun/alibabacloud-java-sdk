// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRisksResponseBody body;

    public static DescribeRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRisksResponse self = new DescribeRisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRisksResponse setBody(DescribeRisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRisksResponseBody getBody() {
        return this.body;
    }

}
