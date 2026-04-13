// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateMacSecKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateMacSecKeyResponseBody body;

    public static AssociateMacSecKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateMacSecKeyResponse self = new AssociateMacSecKeyResponse();
        return TeaModel.build(map, self);
    }

    public AssociateMacSecKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateMacSecKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateMacSecKeyResponse setBody(AssociateMacSecKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateMacSecKeyResponseBody getBody() {
        return this.body;
    }

}
