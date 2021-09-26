// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DeleteDataLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataLimitResponseBody body;

    public static DeleteDataLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLimitResponse self = new DeleteDataLimitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLimitResponse setBody(DeleteDataLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLimitResponseBody getBody() {
        return this.body;
    }

}
