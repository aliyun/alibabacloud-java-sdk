// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOmsEndpointsResponseBody body;

    public static DeleteOmsEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsEndpointsResponse self = new DeleteOmsEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOmsEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOmsEndpointsResponse setBody(DeleteOmsEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOmsEndpointsResponseBody getBody() {
        return this.body;
    }

}
