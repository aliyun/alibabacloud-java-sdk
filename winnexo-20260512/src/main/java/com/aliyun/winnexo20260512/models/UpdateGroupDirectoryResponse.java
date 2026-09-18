// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGroupDirectoryResponseBody body;

    public static UpdateGroupDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDirectoryResponse self = new UpdateGroupDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupDirectoryResponse setBody(UpdateGroupDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDirectoryResponseBody getBody() {
        return this.body;
    }

}
