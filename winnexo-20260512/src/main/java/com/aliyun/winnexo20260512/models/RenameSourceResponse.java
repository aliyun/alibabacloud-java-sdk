// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RenameSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameSourceResponseBody body;

    public static RenameSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameSourceResponse self = new RenameSourceResponse();
        return TeaModel.build(map, self);
    }

    public RenameSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameSourceResponse setBody(RenameSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameSourceResponseBody getBody() {
        return this.body;
    }

}
