// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBInstanceResponseBody body;

    public static DeleteDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponse self = new DeleteDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceResponse setBody(DeleteDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceResponseBody getBody() {
        return this.body;
    }

}
