// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeLogoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogoResponseBody body;

    public static DescribeLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogoResponse self = new DescribeLogoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogoResponse setBody(DescribeLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogoResponseBody getBody() {
        return this.body;
    }

}
