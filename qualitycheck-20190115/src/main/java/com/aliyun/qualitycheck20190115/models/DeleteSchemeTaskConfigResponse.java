// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSchemeTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchemeTaskConfigResponseBody body;

    public static DeleteSchemeTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemeTaskConfigResponse self = new DeleteSchemeTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchemeTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchemeTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchemeTaskConfigResponse setBody(DeleteSchemeTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

}
