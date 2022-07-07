// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListProceedingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProceedingsResponseBody body;

    public static ListProceedingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProceedingsResponse self = new ListProceedingsResponse();
        return TeaModel.build(map, self);
    }

    public ListProceedingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProceedingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProceedingsResponse setBody(ListProceedingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProceedingsResponseBody getBody() {
        return this.body;
    }

}
