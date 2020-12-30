// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBgpNetworkResponseBody body;

    public static DeleteBgpNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpNetworkResponse self = new DeleteBgpNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBgpNetworkResponse setBody(DeleteBgpNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBgpNetworkResponseBody getBody() {
        return this.body;
    }

}
