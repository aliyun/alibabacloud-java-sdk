// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartAccessGatewaysResponseBody body;

    public static DescribeSmartAccessGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewaysResponse self = new DescribeSmartAccessGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartAccessGatewaysResponse setBody(DescribeSmartAccessGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewaysResponseBody getBody() {
        return this.body;
    }

}
