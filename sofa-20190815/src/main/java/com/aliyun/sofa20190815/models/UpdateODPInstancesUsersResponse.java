// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPInstancesUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPInstancesUsersResponseBody body;

    public static UpdateODPInstancesUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPInstancesUsersResponse self = new UpdateODPInstancesUsersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPInstancesUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPInstancesUsersResponse setBody(UpdateODPInstancesUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPInstancesUsersResponseBody getBody() {
        return this.body;
    }

}
