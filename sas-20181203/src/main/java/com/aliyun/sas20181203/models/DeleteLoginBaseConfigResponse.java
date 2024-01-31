// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLoginBaseConfigResponseBody body;

    public static DeleteLoginBaseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginBaseConfigResponse self = new DeleteLoginBaseConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLoginBaseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLoginBaseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLoginBaseConfigResponse setBody(DeleteLoginBaseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLoginBaseConfigResponseBody getBody() {
        return this.body;
    }

}
