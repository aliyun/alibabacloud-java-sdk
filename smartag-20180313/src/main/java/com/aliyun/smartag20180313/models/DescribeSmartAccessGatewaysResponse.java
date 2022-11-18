// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public DescribeSmartAccessGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartAccessGatewaysResponse setBody(DescribeSmartAccessGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewaysResponseBody getBody() {
        return this.body;
    }

}
