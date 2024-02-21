// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcEndpointServiceResponseBody body;

    public static CreateVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointServiceResponse self = new CreateVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcEndpointServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcEndpointServiceResponse setBody(CreateVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
