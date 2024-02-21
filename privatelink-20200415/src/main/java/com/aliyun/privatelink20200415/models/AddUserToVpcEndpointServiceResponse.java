// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddUserToVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserToVpcEndpointServiceResponseBody body;

    public static AddUserToVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToVpcEndpointServiceResponse self = new AddUserToVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToVpcEndpointServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToVpcEndpointServiceResponse setBody(AddUserToVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
