// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupDirectoryResponseBody body;

    public static CreateGroupDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDirectoryResponse self = new CreateGroupDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupDirectoryResponse setBody(CreateGroupDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupDirectoryResponseBody getBody() {
        return this.body;
    }

}
