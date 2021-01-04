// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExecutionsResponseBody body;

    public static DeleteExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionsResponse self = new DeleteExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExecutionsResponse setBody(DeleteExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExecutionsResponseBody getBody() {
        return this.body;
    }

}
