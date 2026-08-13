// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserInfoResponseBody body;

    public static UpdateUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInfoResponse self = new UpdateUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserInfoResponse setBody(UpdateUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserInfoResponseBody getBody() {
        return this.body;
    }

}
