// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCheckTypeToSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCheckTypeToSchemeResponseBody body;

    public static DeleteCheckTypeToSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckTypeToSchemeResponse self = new DeleteCheckTypeToSchemeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCheckTypeToSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCheckTypeToSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCheckTypeToSchemeResponse setBody(DeleteCheckTypeToSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCheckTypeToSchemeResponseBody getBody() {
        return this.body;
    }

}
