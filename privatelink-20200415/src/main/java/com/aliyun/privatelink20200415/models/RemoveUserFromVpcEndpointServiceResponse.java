// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class RemoveUserFromVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserFromVpcEndpointServiceResponseBody body;

    public static RemoveUserFromVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromVpcEndpointServiceResponse self = new RemoveUserFromVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromVpcEndpointServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserFromVpcEndpointServiceResponse setBody(RemoveUserFromVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
