// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteApisecEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApisecEventResponseBody body;

    public static DeleteApisecEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApisecEventResponse self = new DeleteApisecEventResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApisecEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApisecEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApisecEventResponse setBody(DeleteApisecEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApisecEventResponseBody getBody() {
        return this.body;
    }

}
