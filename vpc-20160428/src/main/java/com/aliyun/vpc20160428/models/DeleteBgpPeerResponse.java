// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpPeerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBgpPeerResponseBody body;

    public static DeleteBgpPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpPeerResponse self = new DeleteBgpPeerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBgpPeerResponse setBody(DeleteBgpPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBgpPeerResponseBody getBody() {
        return this.body;
    }

}
