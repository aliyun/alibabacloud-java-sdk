// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeASMGatewayImportedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeASMGatewayImportedServicesResponse setBody(DescribeASMGatewayImportedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeASMGatewayImportedServicesResponseBody getBody() {
        return this.body;
    }

}
