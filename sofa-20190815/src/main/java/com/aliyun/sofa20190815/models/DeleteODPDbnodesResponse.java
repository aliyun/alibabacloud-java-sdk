// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPDbnodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPDbnodesResponseBody body;

    public static DeleteODPDbnodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPDbnodesResponse self = new DeleteODPDbnodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPDbnodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPDbnodesResponse setBody(DeleteODPDbnodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPDbnodesResponseBody getBody() {
        return this.body;
    }

}
