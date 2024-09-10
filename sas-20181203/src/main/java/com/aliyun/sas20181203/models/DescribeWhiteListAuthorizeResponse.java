// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListAuthorizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListAuthorizeResponseBody body;

    public static DescribeWhiteListAuthorizeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListAuthorizeResponse self = new DescribeWhiteListAuthorizeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListAuthorizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListAuthorizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListAuthorizeResponse setBody(DescribeWhiteListAuthorizeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListAuthorizeResponseBody getBody() {
        return this.body;
    }

}
