// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePtsScenesResponseBody body;

    public static DeletePtsScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsScenesResponse self = new DeletePtsScenesResponse();
        return TeaModel.build(map, self);
    }

    public DeletePtsScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePtsScenesResponse setBody(DeletePtsScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePtsScenesResponseBody getBody() {
        return this.body;
    }

}
