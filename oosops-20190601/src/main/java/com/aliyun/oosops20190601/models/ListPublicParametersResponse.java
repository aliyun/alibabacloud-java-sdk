// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublicParametersResponseBody body;

    public static ListPublicParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicParametersResponse self = new ListPublicParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicParametersResponse setBody(ListPublicParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicParametersResponseBody getBody() {
        return this.body;
    }

}
