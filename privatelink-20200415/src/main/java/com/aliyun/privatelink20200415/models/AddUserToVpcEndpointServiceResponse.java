// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddUserToVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddUserToVpcEndpointServiceResponse setBody(AddUserToVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
