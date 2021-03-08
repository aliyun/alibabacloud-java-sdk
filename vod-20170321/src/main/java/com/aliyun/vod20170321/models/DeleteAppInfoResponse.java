// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppInfoResponseBody body;

    public static DeleteAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInfoResponse self = new DeleteAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppInfoResponse setBody(DeleteAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppInfoResponseBody getBody() {
        return this.body;
    }

}
