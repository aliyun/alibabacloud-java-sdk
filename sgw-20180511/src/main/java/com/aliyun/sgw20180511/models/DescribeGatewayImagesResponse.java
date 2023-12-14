// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayImagesResponseBody body;

    public static DescribeGatewayImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayImagesResponse self = new DescribeGatewayImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayImagesResponse setBody(DescribeGatewayImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayImagesResponseBody getBody() {
        return this.body;
    }

}
