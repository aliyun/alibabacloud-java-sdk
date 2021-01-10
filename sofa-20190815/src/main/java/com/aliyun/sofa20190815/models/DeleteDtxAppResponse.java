// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDtxAppResponseBody body;

    public static DeleteDtxAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppResponse self = new DeleteDtxAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtxAppResponse setBody(DeleteDtxAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtxAppResponseBody getBody() {
        return this.body;
    }

}
