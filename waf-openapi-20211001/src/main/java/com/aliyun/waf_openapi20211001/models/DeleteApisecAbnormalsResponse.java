// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteApisecAbnormalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApisecAbnormalsResponseBody body;

    public static DeleteApisecAbnormalsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApisecAbnormalsResponse self = new DeleteApisecAbnormalsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApisecAbnormalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApisecAbnormalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApisecAbnormalsResponse setBody(DeleteApisecAbnormalsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApisecAbnormalsResponseBody getBody() {
        return this.body;
    }

}
