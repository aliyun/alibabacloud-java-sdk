// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppBiztypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDtxAppBiztypeResponseBody body;

    public static DeleteDtxAppBiztypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppBiztypeResponse self = new DeleteDtxAppBiztypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppBiztypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtxAppBiztypeResponse setBody(DeleteDtxAppBiztypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtxAppBiztypeResponseBody getBody() {
        return this.body;
    }

}
