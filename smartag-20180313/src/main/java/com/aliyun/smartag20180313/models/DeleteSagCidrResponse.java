// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSagCidrResponseBody body;

    public static DeleteSagCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagCidrResponse self = new DeleteSagCidrResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSagCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSagCidrResponse setBody(DeleteSagCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSagCidrResponseBody getBody() {
        return this.body;
    }

}
