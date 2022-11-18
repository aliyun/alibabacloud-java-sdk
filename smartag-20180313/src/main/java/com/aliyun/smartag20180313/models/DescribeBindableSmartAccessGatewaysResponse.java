// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeBindableSmartAccessGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBindableSmartAccessGatewaysResponseBody body;

    public static DescribeBindableSmartAccessGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindableSmartAccessGatewaysResponse self = new DescribeBindableSmartAccessGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBindableSmartAccessGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBindableSmartAccessGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBindableSmartAccessGatewaysResponse setBody(DescribeBindableSmartAccessGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBindableSmartAccessGatewaysResponseBody getBody() {
        return this.body;
    }

}
