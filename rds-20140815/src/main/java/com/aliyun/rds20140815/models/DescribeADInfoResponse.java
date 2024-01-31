// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeADInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeADInfoResponseBody body;

    public static DescribeADInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeADInfoResponse self = new DescribeADInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeADInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeADInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeADInfoResponse setBody(DescribeADInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeADInfoResponseBody getBody() {
        return this.body;
    }

}
