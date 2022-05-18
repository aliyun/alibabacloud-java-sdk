// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPrincipalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrincipalsResponseBody body;

    public static ListPrincipalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrincipalsResponse self = new ListPrincipalsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrincipalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrincipalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrincipalsResponse setBody(ListPrincipalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrincipalsResponseBody getBody() {
        return this.body;
    }

}
