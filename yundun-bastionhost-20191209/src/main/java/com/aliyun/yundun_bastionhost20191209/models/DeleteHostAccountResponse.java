// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHostAccountResponseBody body;

    public static DeleteHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAccountResponse self = new DeleteHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHostAccountResponse setBody(DeleteHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostAccountResponseBody getBody() {
        return this.body;
    }

}
