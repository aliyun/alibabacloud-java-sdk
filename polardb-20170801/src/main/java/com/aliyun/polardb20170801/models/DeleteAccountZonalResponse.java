// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAccountZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccountZonalResponseBody body;

    public static DeleteAccountZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountZonalResponse self = new DeleteAccountZonalResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccountZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccountZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccountZonalResponse setBody(DeleteAccountZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccountZonalResponseBody getBody() {
        return this.body;
    }

}
