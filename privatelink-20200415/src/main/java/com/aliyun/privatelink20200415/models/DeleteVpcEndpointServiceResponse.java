// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpcEndpointServiceResponseBody body;

    public static DeleteVpcEndpointServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointServiceResponse self = new DeleteVpcEndpointServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcEndpointServiceResponse setBody(DeleteVpcEndpointServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcEndpointServiceResponseBody getBody() {
        return this.body;
    }

}
