// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteClogServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClogServiceResponseBody body;

    public static DeleteClogServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClogServiceResponse self = new DeleteClogServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClogServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClogServiceResponse setBody(DeleteClogServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClogServiceResponseBody getBody() {
        return this.body;
    }

}
