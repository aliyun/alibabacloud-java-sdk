// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteOpsItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpsItemsResponseBody body;

    public static DeleteOpsItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpsItemsResponse self = new DeleteOpsItemsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpsItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpsItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpsItemsResponse setBody(DeleteOpsItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpsItemsResponseBody getBody() {
        return this.body;
    }

}
