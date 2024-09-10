// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListProcessResponseBody body;

    public static DescribeWhiteListProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListProcessResponse self = new DescribeWhiteListProcessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListProcessResponse setBody(DescribeWhiteListProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListProcessResponseBody getBody() {
        return this.body;
    }

}
