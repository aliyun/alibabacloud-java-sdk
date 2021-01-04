// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeBindableSmartAccessGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeBindableSmartAccessGatewaysResponse setBody(DescribeBindableSmartAccessGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBindableSmartAccessGatewaysResponseBody getBody() {
        return this.body;
    }

}
