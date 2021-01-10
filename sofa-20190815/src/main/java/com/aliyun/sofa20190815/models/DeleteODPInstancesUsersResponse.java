// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPInstancesUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPInstancesUsersResponseBody body;

    public static DeleteODPInstancesUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPInstancesUsersResponse self = new DeleteODPInstancesUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPInstancesUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPInstancesUsersResponse setBody(DeleteODPInstancesUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPInstancesUsersResponseBody getBody() {
        return this.body;
    }

}
