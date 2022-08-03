// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteMultipleObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMultipleObjectsResponseBody body;

    public static DeleteMultipleObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipleObjectsResponse self = new DeleteMultipleObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultipleObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultipleObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultipleObjectsResponse setBody(DeleteMultipleObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultipleObjectsResponseBody getBody() {
        return this.body;
    }

}
