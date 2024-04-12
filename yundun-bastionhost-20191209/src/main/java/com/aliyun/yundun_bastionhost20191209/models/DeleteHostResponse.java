// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHostResponseBody body;

    public static DeleteHostResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostResponse self = new DeleteHostResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHostResponse setBody(DeleteHostResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostResponseBody getBody() {
        return this.body;
    }

}
