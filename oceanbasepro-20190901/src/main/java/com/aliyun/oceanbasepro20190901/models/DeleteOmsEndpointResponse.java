// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOmsEndpointResponseBody body;

    public static DeleteOmsEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsEndpointResponse self = new DeleteOmsEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOmsEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOmsEndpointResponse setBody(DeleteOmsEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOmsEndpointResponseBody getBody() {
        return this.body;
    }

}
