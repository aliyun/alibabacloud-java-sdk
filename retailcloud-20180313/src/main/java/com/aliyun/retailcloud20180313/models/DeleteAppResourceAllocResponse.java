// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppResourceAllocResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppResourceAllocResponseBody body;

    public static DeleteAppResourceAllocResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourceAllocResponse self = new DeleteAppResourceAllocResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourceAllocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppResourceAllocResponse setBody(DeleteAppResourceAllocResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppResourceAllocResponseBody getBody() {
        return this.body;
    }

}
