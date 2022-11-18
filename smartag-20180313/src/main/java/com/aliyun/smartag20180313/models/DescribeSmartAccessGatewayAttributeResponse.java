// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartAccessGatewayAttributeResponseBody body;

    public static DescribeSmartAccessGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayAttributeResponse self = new DescribeSmartAccessGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartAccessGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartAccessGatewayAttributeResponse setBody(DescribeSmartAccessGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
