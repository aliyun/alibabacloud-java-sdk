// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSConfigmapResponseBody body;

    public static DeleteAKSConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSConfigmapResponse self = new DeleteAKSConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSConfigmapResponse setBody(DeleteAKSConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSConfigmapResponseBody getBody() {
        return this.body;
    }

}
