// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPInstancesUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateODPInstancesUsersResponseBody body;

    public static CreateODPInstancesUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateODPInstancesUsersResponse self = new CreateODPInstancesUsersResponse();
        return TeaModel.build(map, self);
    }

    public CreateODPInstancesUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateODPInstancesUsersResponse setBody(CreateODPInstancesUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateODPInstancesUsersResponseBody getBody() {
        return this.body;
    }

}
