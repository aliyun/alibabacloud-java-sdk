// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPInstancesResponseBody body;

    public static DeleteODPInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPInstancesResponse self = new DeleteODPInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPInstancesResponse setBody(DeleteODPInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPInstancesResponseBody getBody() {
        return this.body;
    }

}
