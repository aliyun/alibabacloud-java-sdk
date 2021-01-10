// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDtxAppActionResponseBody body;

    public static DeleteDtxAppActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppActionResponse self = new DeleteDtxAppActionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtxAppActionResponse setBody(DeleteDtxAppActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtxAppActionResponseBody getBody() {
        return this.body;
    }

}
