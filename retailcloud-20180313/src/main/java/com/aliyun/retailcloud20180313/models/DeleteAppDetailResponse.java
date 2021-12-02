// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppDetailResponseBody body;

    public static DeleteAppDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDetailResponse self = new DeleteAppDetailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppDetailResponse setBody(DeleteAppDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppDetailResponseBody getBody() {
        return this.body;
    }

}
