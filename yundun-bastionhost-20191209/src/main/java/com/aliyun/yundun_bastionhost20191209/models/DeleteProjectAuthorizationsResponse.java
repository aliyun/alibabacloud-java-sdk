// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteProjectAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProjectAuthorizationsResponseBody body;

    public static DeleteProjectAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectAuthorizationsResponse self = new DeleteProjectAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectAuthorizationsResponse setBody(DeleteProjectAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
