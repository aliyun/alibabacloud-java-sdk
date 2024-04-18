// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExecutionsResponse setBody(DeleteExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExecutionsResponseBody getBody() {
        return this.body;
    }

}
