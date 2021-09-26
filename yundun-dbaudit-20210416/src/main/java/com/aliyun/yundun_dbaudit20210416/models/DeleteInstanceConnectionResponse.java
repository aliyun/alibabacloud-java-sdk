// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class DeleteInstanceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceConnectionResponseBody body;

    public static DeleteInstanceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceConnectionResponse self = new DeleteInstanceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceConnectionResponse setBody(DeleteInstanceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceConnectionResponseBody getBody() {
        return this.body;
    }

}
