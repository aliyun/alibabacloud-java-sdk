// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSchemeTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSchemeTaskConfigResponseBody body;

    public static CreateSchemeTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeTaskConfigResponse self = new CreateSchemeTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchemeTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchemeTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSchemeTaskConfigResponse setBody(CreateSchemeTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

}
