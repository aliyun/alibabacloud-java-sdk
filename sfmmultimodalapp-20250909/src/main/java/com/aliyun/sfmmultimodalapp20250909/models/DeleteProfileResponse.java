// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProfileResponseBody body;

    public static DeleteProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileResponse self = new DeleteProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProfileResponse setBody(DeleteProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProfileResponseBody getBody() {
        return this.body;
    }

}
