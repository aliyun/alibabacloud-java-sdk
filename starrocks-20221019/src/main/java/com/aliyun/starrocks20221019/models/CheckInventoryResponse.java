// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CheckInventoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInventoryResponseBody body;

    public static CheckInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInventoryResponse self = new CheckInventoryResponse();
        return TeaModel.build(map, self);
    }

    public CheckInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInventoryResponse setBody(CheckInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInventoryResponseBody getBody() {
        return this.body;
    }

}
