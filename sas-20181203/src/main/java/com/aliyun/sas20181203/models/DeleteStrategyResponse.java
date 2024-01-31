// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStrategyResponseBody body;

    public static DeleteStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStrategyResponse self = new DeleteStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStrategyResponse setBody(DeleteStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStrategyResponseBody getBody() {
        return this.body;
    }

}
