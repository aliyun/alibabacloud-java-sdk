// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteIdleInstanceCullerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIdleInstanceCullerResponseBody body;

    public static DeleteIdleInstanceCullerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdleInstanceCullerResponse self = new DeleteIdleInstanceCullerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIdleInstanceCullerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIdleInstanceCullerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIdleInstanceCullerResponse setBody(DeleteIdleInstanceCullerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIdleInstanceCullerResponseBody getBody() {
        return this.body;
    }

}
