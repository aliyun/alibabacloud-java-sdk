// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeASMGatewayImportedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeASMGatewayImportedServicesResponseBody body;

    public static DescribeASMGatewayImportedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeASMGatewayImportedServicesResponse self = new DescribeASMGatewayImportedServicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeASMGatewayImportedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeASMGatewayImportedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeASMGatewayImportedServicesResponse setBody(DescribeASMGatewayImportedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeASMGatewayImportedServicesResponseBody getBody() {
        return this.body;
    }

}
