// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsBiztypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDTXAppsBiztypeResponseBody body;

    public static DeleteDTXAppsBiztypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsBiztypeResponse self = new DeleteDTXAppsBiztypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsBiztypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDTXAppsBiztypeResponse setBody(DeleteDTXAppsBiztypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDTXAppsBiztypeResponseBody getBody() {
        return this.body;
    }

}
